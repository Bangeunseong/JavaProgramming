package StreamNParallelOperation.Collect.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Honggildong", 10, Student.Sex.MALE),
            new Student("Kimsumi", 6, Student.Sex.FEMALE),
            new Student("ShinRamen", 10, Student.Sex.MALE),
            new Student("Parksumi", 6, Student.Sex.FEMALE)
        );

        //Male list
        List<Student> maleList = totalList.stream()
        .filter(s->s.getSex() == Student.Sex.MALE)
        .collect(Collectors.toList());
        maleList.stream().forEach(s->System.out.println(s.getName()));

        System.out.println();

        //Female list
        List<Student> femaleList = totalList.stream()
        .filter(s->s.getSex() == Student.Sex.FEMALE)
        .collect(Collectors.toList());
        femaleList.stream().forEach(s->System.out.println(s.getName()));

        System.out.println();

        //Female HashSet
        Set<Student> femaleSet = totalList.stream()
        .filter(s->s.getSex() == Student.Sex.FEMALE)
        .collect(Collectors.toCollection(HashSet::new));
        femaleSet.stream().forEach(s->System.out.println(s.getName()));
    }
}
