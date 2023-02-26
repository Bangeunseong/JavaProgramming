package Stream.Reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(
            new Student("Honggildong", 92),
            new Student("Shinyeongman", 95),
            new Student("Kimjava", 88)
        );

        int sum1 = students.stream()
        .mapToInt(Student::getScore)
        .sum();

        int sum2 = students.stream()
        .map(Student::getScore)
        .reduce((a,b)->a+b)
        .get();

        int sum3 = students.stream()
        .map(Student::getScore)
        .reduce(sum2, (a,b)->a+b);
    }
}
