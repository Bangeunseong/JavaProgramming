package Stream.Collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Honggildong", 10, Student.Sex.MALE),
            new Student("Shinyeongman", 10, Student.Sex.MALE),
            new Student("Kimsumi", 6, Student.Sex.FEMALE),
            new Student("Parksumi", 6, Student.Sex.FEMALE)
        );

        MaleStudent malseStudent = totalList.stream()
        .filter(s->s.getSex().equals(Student.Sex.MALE))
        .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        malseStudent.getList().stream()
        .forEach(s->System.out.println(s.getName()));
    }
}
