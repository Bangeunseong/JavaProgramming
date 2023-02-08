package StreamNParallelOperation.Filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Honggildong","Shingyeondong","Kimjava","Shinramen","Shingyeondong");

        names.stream().distinct().forEach(e->System.out.println(e));//repeated object remove
        System.out.println();

        names.stream().filter(n->n.startsWith("Shin")).forEach(n->System.out.println(n));//filter certain objects
        System.out.println();

        names.stream().distinct().filter(n->n.startsWith("Shin")).forEach(n->System.out.println(n));
    }
}
