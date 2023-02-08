package StreamNParallelOperation.CustomAggregation;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(
            new Student("Honggildong", 92),
            new Student("ShinRamen", 95),
            new Student("Kimjava", 88)
        );

        int sum1 = studentList.stream()
        .mapToInt(Student::getScore)
        .sum();
        System.out.println("Sum1: " + sum1);

        int sum2 = studentList.stream()
        .map(Student::getScore)
        .reduce((a,b)->a+b)
        .get();
        System.out.println("Sum2: " + sum2);

        int sum3 = studentList.stream()
        .map(Student::getScore)
        .reduce(0, (a,b)->a+b);
        System.out.println("Sum3: " + sum3);
    }
}
