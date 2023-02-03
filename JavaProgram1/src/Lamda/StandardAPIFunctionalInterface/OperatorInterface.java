package Lamda.StandardAPIFunctionalInterface;

import java.util.function.IntBinaryOperator;

public class OperatorInterface {
    private static int[] scores = {92,95,87};

    public static int maxOrmin(IntBinaryOperator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.applyAsInt(result, score);
        }
        return result;
    }
    public static void main(String[] args){
        int max = maxOrmin(
            (a,b) -> {
                if(a>=b) return a;
                return b;
            }
        );
        int min = maxOrmin(
            (a,b) -> {
                if(a<=b) return a;
                return b;
            }
        );
        System.out.println("Max: " + max + " Min: " + min);
    }
}
