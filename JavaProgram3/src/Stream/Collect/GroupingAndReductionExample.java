package Stream.Collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Honggildong", 10, Student.Sex.MALE),
            new Student("Shinyeongman", 10, Student.Sex.MALE),
            new Student("Kimsumi", 6, Student.Sex.FEMALE),
            new Student("Parksumi", 6, Student.Sex.FEMALE)
        );

        Map<Student.Sex,Double> mapBySex = totalList.stream()
        .collect(
            Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore))
        );
        System.out.println("Male average score: " + mapBySex.get(Student.Sex.MALE));
        System.out.println("Female average score: " + mapBySex.get(Student.Sex.FEMALE));

        Map<Student.Sex,String> mapByName = totalList.stream()
        .collect(
            Collectors.groupingBy(
                Student::getSex,
                Collectors.mapping(
                    Student::getName, Collectors.joining(",")
                )
            )
        );
        System.out.println(mapByName.get(Student.Sex.MALE));
        System.out.println(mapByName.get(Student.Sex.FEMALE));
    }
}
