package Lambda.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReference {
    public static void main(String[] args){
        Function<String,Member> function = Member::new;
        Member member1 = function.apply("Angel");

        BiFunction<String,String,Member> bifunction = Member::new;
        Member member2 = bifunction.apply("Shincheonsa", "Angel");
    }
}
