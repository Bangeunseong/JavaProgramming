package Stream.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args){
        IntStream intStream = Arrays.stream(new int[] {1,2,5,4,3,7,6});
        intStream.sorted().forEach(data->System.out.print(data + " "));
        System.out.println();

        List<Student> students = Arrays.asList(
            new Student("Honggildong", 30),
            new Student("Shinyeongmin", 10),
            new Student("Parksumi", 20)
        );
        students.stream()
        .sorted()
        .forEach(data->System.out.print(data.getScore() + " "));
        System.out.println();
    }
}
