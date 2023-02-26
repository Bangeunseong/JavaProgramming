package Stream.TypesofStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args){
        String[] strArray = {"Honggildong","Shinyeonggil","Kimmina"};
        Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(s->System.out.println(s));

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(s->System.out.print(s + " "));
        System.out.println();
    }
}
