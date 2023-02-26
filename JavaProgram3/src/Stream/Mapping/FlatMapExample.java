package Stream.Mapping;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args){
        List<String> inputList1 = Arrays.asList("java8 Lambda", "stream Mapping");

        inputList1.stream().flatMap(s->Arrays.stream(s.split(" ")))
        .forEach(System.out::println);
        System.out.println();

        List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
        inputList2.stream()
        .flatMapToInt(data->{
            String[] strArr = data.split(",");
            int[] intArr = new int[strArr.length];
            int i = 0;
            for(String val : strArr){intArr[i++] = Integer.parseInt(val.trim());}
            return Arrays.stream(intArr);
        })
        .forEach(System.out::println);
    }
}
