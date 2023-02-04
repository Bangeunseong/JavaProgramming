package Lamda.StandardAPIFunctionalInterface.MethodReference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReference {
    public static void print(int order){
        if(order<0)System.out.println("Alphabetically front");
        else if(order==0) System.out.println("Same String");
        else System.out.println("Alphabetically rear");
    }
    public static void main(String[] args){
        ToIntBiFunction<String,String> function;

        function = (a,b)->a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "JAVA8"));

        function = String::compareToIgnoreCase;
        print(function.applyAsInt("Java8", "JAVA8"));
    }
}
