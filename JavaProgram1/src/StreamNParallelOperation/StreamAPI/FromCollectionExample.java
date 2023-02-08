package StreamNParallelOperation.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args){
        List<Student> studentlist = Arrays.asList(
            new Student("Honggildong",10),
            new Student("Shinyeonggeon",20),
            new Student("Yumiseon", 30)
        );

        Stream<Student> stream = studentlist.stream();
        stream.forEach(s->System.out.println(s.getName()));
    }
}
