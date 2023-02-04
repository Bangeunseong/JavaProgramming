package Lamda.StandardAPIFunctionalInterface.andThenCompose;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){
        //Check multiple of 2
        IntPredicate predicateA = a -> a%2==0;
        //Check multiple of 3
        IntPredicate predicateB = a -> a%3==0;

        IntPredicate predicateAB;
        boolean result;

        //and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("Is nine a multiple of 2 and 3? " + result);

        //or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("Is nine a multiple of 2 or 3? " + result);

        //negate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("Is nine a odd number? " + result);

        //isEqual()
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null, null: " + predicate.test(null));
        predicate = Predicate.isEqual("Java8");
        System.out.println("null, Java8: " + predicate.test(null));
        predicate = Predicate.isEqual(null);
        System.out.println("Java8, null: " + predicate.test("Java8"));
        predicate = Predicate.isEqual("Java8");
        System.out.println("Java8, Java8: " + predicate.test("Java8"));
    }
}
