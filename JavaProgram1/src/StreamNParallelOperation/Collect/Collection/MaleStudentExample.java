package StreamNParallelOperation.Collect.Collection;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Honggildong", 10, Student.Sex.MALE),
            new Student("Kimsueo", 10, Student.Sex.FEMALE),
            new Student("ShinRamen", 10, Student.Sex.MALE),
            new Student("Parksumi", 6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
        .filter(s->s.getSex() == Student.Sex.MALE)
        .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream()
        .forEach(s->System.out.println(s.getName()));
    }
}
