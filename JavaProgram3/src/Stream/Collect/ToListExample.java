package Stream.Collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Shinyeongman", 6, Student.Sex.MALE),
            new Student("Honggildong", 10, Student.Sex.MALE),
            new Student("Parksumi", 6, Student.Sex.FEMALE),
            new Student("Kimsumi", 6, Student.Sex.FEMALE)
        );

        List<Student> maleList = totalList.stream()
        .sorted()
        .filter(s->s.getSex().equals(Student.Sex.MALE))
        .collect(Collectors.toList());
        maleList.stream()
        .forEach(s->System.out.println(s.getName()));

        Set<Student> femaleSet = totalList.stream()
        .filter(s->s.getSex().equals(Student.Sex.FEMALE))
        .collect(Collectors.toCollection(HashSet::new));
        femaleSet.stream()
        .forEach(s->System.out.println(s.getName()));
    }
}
