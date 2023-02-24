package Lambda.DefaultMethod.Function;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
    public static void main(String[] args){
        Function<Member,Address> functionA;
        Function<Address,String> functionB;
        Function<Member,String> functionAB;
        String city;

        functionA = m->m.getAddress();
        functionB = m->m.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(new Member("Honggildong", "Hong", new Address("Korea", "Seoul")));
        System.out.println("Residence: " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(new Member("Honggildong", "Hong", new Address("Korea", "Seoul")));
        System.out.println("Residence: " + city);
    }
}
