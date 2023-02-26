package Stream.Aggregate;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args){
        long count = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(a->a%2==0)
        .count();
        System.out.println("Result: " + count);

        long sum = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(a->a%2==0)
        .sum();
        System.out.println("Result: " + sum);

        double avg = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(a->a%2==0)
        .average().getAsDouble();
        System.out.println("Result: " + avg);

        int min = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(s->s%2==0)
        .min().getAsInt();
        System.out.println("Result: " + min);

        int first = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(a->a%3==0)
        .findFirst().getAsInt();
        System.out.println("Result: " + first);
    }
}
