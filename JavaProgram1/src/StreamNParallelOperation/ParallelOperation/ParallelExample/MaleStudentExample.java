package StreamNParallelOperation.ParallelOperation.ParallelExample;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Honggildong", 10, Student.Sex.MALE),
            new Student("Kimsumi", 10, Student.Sex.FEMALE),
            new Student("ShinRamen", 10, Student.Sex.MALE),
            new Student("Parksumi", 10, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.parallelStream()
        .filter(s->s.getSex() == Student.Sex.MALE)
        .collect(MaleStudent::new,MaleStudent::accumulate,MaleStudent::combine);

        maleStudent.getList().stream()
        .forEach(s->System.out.println(s.getName()));
    }
}
