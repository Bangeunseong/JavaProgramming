package Lambda.DefaultMethod.Predicate;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
    public static void main(String[] args){
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println(predicate.test(null));

        predicate = Predicate.isEqual("Java8");
        System.out.println(predicate.test("Java8"));

        predicate = Predicate.isEqual(null);
        System.out.println(predicate.test("Java8"));
    }
}
