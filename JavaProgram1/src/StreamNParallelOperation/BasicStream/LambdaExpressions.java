package StreamNParallelOperation.BasicStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressions {
    public static void main(String[] args){
        List<Student> list = Arrays.asList(
            new Student("Honggildong",90),
            new Student("Shinyonggeon", 92)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
