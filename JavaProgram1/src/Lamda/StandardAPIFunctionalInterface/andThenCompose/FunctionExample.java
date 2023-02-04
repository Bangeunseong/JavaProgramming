package Lamda.StandardAPIFunctionalInterface.andThenCompose;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args){
        Function<Member,Address> functionA;
        Function<Address,String> functionB;
        Function<Member,String> functionAB;
        String city;

        functionA = (m)->m.getAddress();
        functionB = (m)->m.getCity();
        
        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(new Member("Honggildong", "Hong", new Address("SouthKorea", "Seoul")));
        System.out.println("Current city: " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(new Member("Honggildong", "Hong", new Address("SouthKorea", "Seoul")));
        System.out.println("Current city: " + city);
    }
}
