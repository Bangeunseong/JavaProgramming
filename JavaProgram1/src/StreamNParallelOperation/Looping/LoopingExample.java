package StreamNParallelOperation.Looping;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args){
        int[] intArr = {1,2,3,4,5};

        System.out.println("[Calling peek() method at last]");
        Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));
        
        //Middle method like peek() needs final method
        System.out.println("[Calling final method at last]");
        int total = Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n)).sum();
        System.out.println("Total Result: " + total);
        
        //forEach() is final method doesn't need another final method
        System.out.println("[Calling forEach() at last]");
        Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));
    }
}
