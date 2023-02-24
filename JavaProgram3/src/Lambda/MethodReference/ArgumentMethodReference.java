package Lambda.MethodReference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReference {
    public static void main(String[] args){
        ToIntBiFunction<String,String> function;

        function = (a,b)->a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "JAVA8"));

    }
    public static void print(int order){
        if(order<0) System.out.println("Dictionary front");
        else if(order==0) System.out.println("Same String");
        else System.out.println("Dictionary back");
    }
}
