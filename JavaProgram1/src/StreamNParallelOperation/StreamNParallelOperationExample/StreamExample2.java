package StreamNParallelOperation.StreamNParallelOperationExample;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args){
        List<Member> list = Arrays.asList(
            new Member("Honggildong", 30),
            new Member("Shinramen", 40),
            new Member("Kimjava", 26)
        );

        double avg = list.stream()
        .mapToInt(Member::getAge)
        .average()
        .getAsDouble();

        System.out.println("Average Age: " + avg);
    }
}
