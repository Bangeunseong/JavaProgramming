package Stream.Basic;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args){
        List<Student> list = Arrays.asList(
            new Student("Honggildong", 10),
            new Student("Shinjamen", 20),
            new Student("Yumiseon", 30)
        );

        double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.println("Avg: " + avg);
    }
}
