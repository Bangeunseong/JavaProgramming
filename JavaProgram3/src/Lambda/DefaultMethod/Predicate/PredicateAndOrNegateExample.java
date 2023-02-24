package Lambda.DefaultMethod.Predicate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args){
        IntPredicate predicateA = a->a%2==0;
        IntPredicate predicateB = b->b%3==0;

        IntPredicate predicateAB;
        boolean result;

        //and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("Result: " + result);

        //or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("Result: " + result);

        //negate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("Result: " + result);
    }
}
