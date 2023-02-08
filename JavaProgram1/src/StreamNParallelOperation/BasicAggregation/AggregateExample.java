package StreamNParallelOperation.BasicAggregation;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args){
        long count = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(n->n%2==0)
        .count();
        System.out.println("Count of multiply of 2: " + count);

        long sum = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(n->n%2==0)
        .sum();
        System.out.println("Sum of multiply of 2: " + sum);

        double avg = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(n->n%2==0)
        .average()
        .getAsDouble();
        System.out.println("Average of multiply of 2: " + avg);

        int max = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(n->n%2==0)
        .max()
        .getAsInt();
        System.out.println("Max value in multiply of 2: " + max);

        int min = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(n->n%2==0)
        .min()
        .getAsInt();
        System.out.println("Min value in multiply of 2: " + min);

        int first = Arrays.stream(new int[] {1,2,3,4,5})
        .filter(n->n%3 == 0)
        .findFirst()
        .getAsInt();
        System.out.println("First value in multiply of 3: " + first);
    }
}
