package StreamNParallelOperation.BasicStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void print(String str){
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
    public static void main(String[] args){
        List<String> list = Arrays.asList("Honggildong","Shingyeondong","Kimjava","Lambda","Hangyeonwon");
        
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print);
        System.out.println();

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }
}
