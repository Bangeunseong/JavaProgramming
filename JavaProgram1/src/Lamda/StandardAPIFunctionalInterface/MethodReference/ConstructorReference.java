package Lamda.StandardAPIFunctionalInterface.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReference {
    public static void main(String[] args){
        Function<String,Member> function1 = Member::new;
        Member member1 = function1.apply("Angel");
        System.out.println(member1.getID());

        BiFunction<String,String,Member> function2 = Member::new;
        Member member2 = function2.apply("ShinAngel", "Angel");
        System.out.println(member2.getID());
    }
}
