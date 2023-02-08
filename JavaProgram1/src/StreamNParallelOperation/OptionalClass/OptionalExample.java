package StreamNParallelOperation.OptionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();

        OptionalDouble optional = list.stream()
        .mapToInt(Integer::intValue)
        .average();
        if(optional.isPresent()){System.out.println("Average1: " + optional.getAsDouble());}
        else{System.out.println("Average1: " + 0.0);}

        double avg = list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
        System.out.println("Average2: " + avg);

        list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .ifPresent(a->System.out.println("Average3: " + a));
    }
}
