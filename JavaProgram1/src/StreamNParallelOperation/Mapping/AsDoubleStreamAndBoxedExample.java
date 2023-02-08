package StreamNParallelOperation.Mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5};

        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream().forEach(e->System.out.println(e));
        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream.boxed().forEach(e->System.out.println(e.intValue()));
    }
}
