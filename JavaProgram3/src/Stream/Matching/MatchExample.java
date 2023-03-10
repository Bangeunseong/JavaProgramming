package Stream.Matching;

import java.util.Arrays;

public class MatchExample {
    public static void main(String[] args){
        int[] intArr = {2,4,6};

        boolean result = Arrays.stream(intArr)
        .allMatch(a->a%2==0);
        System.out.println("Result: " + result);

        result = Arrays.stream(intArr)
        .anyMatch(a->a%3==0);
        System.out.println("Result: " + result);

        result = Arrays.stream(intArr)
        .noneMatch(a->a%3==0);
        System.out.println("Result: " + result);
    }
}
