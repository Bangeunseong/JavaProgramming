package Stream.Filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Honggildong","Shinjava","Shinmincheol","Shinjava","Kimmyeonggyu");
        list.stream()
        .distinct()
        .forEach(s->System.out.println(s));
        System.out.println();

        list.stream()
        .distinct().filter(s->s.startsWith("Shin"))
        .forEach(s->System.out.println(s));
    }
}
