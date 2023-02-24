package Lambda.DefaultMethod.Consumer;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args){
        Consumer<Member> consumerA = (m)->System.out.println("ConsumerA: " + m.getName());
        Consumer<Member> consumerB = (m)->System.out.println("ConsumerB: " + m.getID());

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("Hong", "Jackson", null));
    }
}
