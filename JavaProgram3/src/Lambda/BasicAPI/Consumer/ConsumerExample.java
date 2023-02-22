package Lambda.BasicAPI.Consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        Consumer<String> consumer = t->System.out.println(t + "8");
        consumer.accept("Java");
    }
}
