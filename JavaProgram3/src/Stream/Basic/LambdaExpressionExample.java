package Stream.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {
    public static void main(String[] args){
        List<Student> list = Arrays.asList(
            new Student("Honggildong", 90),
            new Student("Shinmyeonggu", 92)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s->{
            System.out.println(s.getName() + ":" + s.getScore());
        });
    }
}
