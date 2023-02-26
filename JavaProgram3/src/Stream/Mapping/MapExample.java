package Stream.Mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(
            new Student("Honggildong", 10),
            new Student("Shinyeonggyu", 20),
            new Student("Yumiseon", 30)
        );

        double result = students.stream()
        .mapToInt(Student::getScore)
        .average().getAsDouble();
        System.out.println("Average Score: " + result);
    }
}
