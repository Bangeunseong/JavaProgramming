package Lamda.StandardAPIFunctionalInterface;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Supplier<String> supplier = ()->{
            String name;
            System.out.print("Name: "); name = scan.nextLine();
            return name;
        };
        System.out.println(supplier.get());
        scan.close();

        IntSupplier intSupplier = ()->{
            int num = (int)(Math.random()*6) + 1;
            return num;
        };
        int num = intSupplier.getAsInt();
        System.out.println("Dice number: " + num);

        BooleanSupplier booleanSupplier = ()->{
            if(num >= 1 & num <= 4) return true;
            return false; 
        };
        System.out.println(booleanSupplier.getAsBoolean());
    }
}
