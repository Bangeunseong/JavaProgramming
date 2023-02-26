package Stream.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        OptionalDouble optional = list.stream()
        .mapToInt(Integer::intValue)
        .average();
        if(optional.isPresent()){System.out.println("Result: " + optional.getAsDouble());}
        else{System.out.println("Result: 0.0");}

        double avg = list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
        System.out.println("Result: " + avg);

        list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .ifPresentOrElse(a->System.out.println(a), new Runnable() {
            @Override
            public void run(){
                System.out.println("Result: 0.0");
            }
        });
    }
}
