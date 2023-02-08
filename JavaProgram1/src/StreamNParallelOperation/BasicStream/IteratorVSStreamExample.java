package StreamNParallelOperation.BasicStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVSStreamExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Honggildong","Shingyeonheon","Kimjava");

        //Using Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        //Using Stream
        Stream<String> stream = list.stream();
        stream.forEach(name->System.out.println(name));
    }
}
