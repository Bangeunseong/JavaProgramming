package StreamNParallelOperation.Matching;

import java.util.Arrays;

public class MatchExample {
    public static void main(String[] args){
        int[] intArr = {2,4,6};

        boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
        System.out.println("All of numbers are multiply of 2? " + result);

        result = Arrays.stream(intArr).anyMatch(a->a%3==0);
        System.out.println("Are any of numbers multiply of 3? " + result);

        result = Arrays.stream(intArr).noneMatch(a->a%3==0);
        System.out.println("Are none of numbers multiply of 3? " + result);
    }
}
