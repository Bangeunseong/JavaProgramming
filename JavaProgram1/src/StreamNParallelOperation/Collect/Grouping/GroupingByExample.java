package StreamNParallelOperation.Collect.Grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Honggildong", 10, Student.Sex.MALE, Student.City.Seoul),
            new Student("Kimsumi", 6, Student.Sex.FEMALE, Student.City.Busan),
            new Student("ShinRamen", 10, Student.Sex.MALE, Student.City.Busan),
            new Student("Parksumi", 6, Student.Sex.FEMALE, Student.City.Seoul)
        );

        Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
        .collect(Collectors.groupingBy(Student::getSex));

        System.out.println("[Male Student]");
        mapBySex.get(Student.Sex.MALE).stream()
        .forEach(s->System.out.print(s.getName() + " "));

        System.out.println("\n");

        System.out.println("[Female Student]");
        mapBySex.get(Student.Sex.FEMALE).stream()
        .forEach(s->System.out.print(s.getName() + " "));

        System.out.println("\n");

        Map<Student.City, List<String>> mapByCity = totalList.stream()
        .collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println("[Seoul]");
        mapByCity.get(Student.City.Seoul).stream()
        .forEach(s->System.out.print(s + " "));

        System.out.println("\n");

        System.out.println("[Busan]");
        mapByCity.get(Student.City.Busan).stream()
        .forEach(s->System.out.print(s + " "));
    }
}
