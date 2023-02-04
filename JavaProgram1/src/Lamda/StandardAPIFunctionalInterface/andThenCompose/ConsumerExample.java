package Lamda.StandardAPIFunctionalInterface.andThenCompose;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        Consumer<Member> consumerA = (m)->{System.out.println("consumerA: " + m.getName());};
        Consumer<Member> consumerB = (m)->{System.out.println("consumerB: " + m.getID());};

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("Honggildong", "Hong", null));
    }
}
