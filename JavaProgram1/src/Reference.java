import java.util.Scanner;
public class Reference {
    public static int add(int[] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++) sum += scores[i];
        return sum;
    }
    public static void main(String[] args){
        //Normal type Variable
        int age = 25;
        double price = 100.5;

        //Reference type Variable
        String name = "ShinYeongGeon";
        String hobby = "Reading Books";

        //Reference type Variable Compare Operator ==,!=
        String refVar1 = "Game";
        String refVar2 = "Vector";
        String refVar3 = refVar2;
        String refVar4 = new String("Game");

        System.out.println(refVar1 == refVar2);     //False
        System.out.println(refVar2 == refVar3);     //True
        System.out.println(refVar1 == refVar4);     //False 'Cause diffrent Object'
        System.out.println(refVar1.equals(refVar4));//True

        //Array type Variable -> Def. Datatype[] name;
        //int[] intArray;       Integer type
        //double[] doubleArray; Double type
        //float[] floatArray;   Float type
        //String[] StringArray; String type

        int[] scores = {83,90,87};
        int sum1 = 0;
        int sum2 = add(new int[] {100,45,67});
        for(int i = 0;i < 3;i++){sum1 += scores[i];}
        System.out.println("Sum1 of scores = " + sum1);
        System.out.println("Sum2 of scores = " + sum2);
        System.out.println("Average of scores = " + (double)sum1 / scores.length);
        System.out.println("Average of scores = " + (double)sum2 / 3);

        
    }
}