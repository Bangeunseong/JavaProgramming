package Lambda.BasicAPI.Supplier;

import java.util.function.IntSupplier;

//boolean int double long supplier<T>
//five different types of supplier exist

public class SupplierExample {
    public static void main(String[] args){
        IntSupplier intSupplier = ()->{
            int num = (int)(Math.random() * 6) + 1;
            return num;
        };

        int result = intSupplier.getAsInt();
        System.out.println("Dice: " + result);
    }
}
