package StreamNParallelOperation.BasicStream;

import java.util.Arrays;
import java.util.List;

public class MapandReduceExample {
    public static void main(String[] args){
        List<Student> studentlist = Arrays.asList(
            new Student("Honggildong", 10),
            new Student("Shinhangeol", 20),
            new Student("Yumiseon", 30)
        );

        double avg = studentlist.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.println("Average: " + avg);
    }
}
