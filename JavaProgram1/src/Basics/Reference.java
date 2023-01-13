package Basics;
import java.util.Scanner;
import java.util.Calendar;
public class Reference {
    public static int add(int[] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++) sum += scores[i];
        return sum;
    }
    public enum Week {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
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

        //Main(String[] args) using guide of args
        if(args.length != 2){
            System.out.println("Program User Guide");
            System.out.println("java MainStringArrayArgument num1 num2");
            System.exit(0);
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int r1 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + r1);

        //Multi Array
        int[][] Grades = new int[2][];
        Grades[0] = new int[2];
        Grades[1] = new int[3];
        for(int i = 0; i < Grades.length; i++) System.out.println("length of Grades[" + i +"] = " + Grades[i].length);

        int[][] mathScores = new int[2][3];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < mathScores.length; i++){
            for(int j = 0; j < mathScores[i].length; j++){
                mathScores[i][j] = scan.nextInt();
            }
        }

        int sum = 0;
        for(int i = 0; i < mathScores.length; i++){
            for(int mathScore : mathScores[i]) sum += mathScore;
        }
        System.out.println("Sum of MathScores = " + sum);

        //Object Reference Array
        System.out.println("How many people in the building?");
        String[] strArray = new String[scan.nextInt()];
        scan.nextLine();
        for(int i = 0; i < strArray.length; i++){
            System.out.print("Type name of person number " + (i + 1) + " : ");
            strArray[i] = scan.nextLine();
        }
        scan.close();
        for(String str : strArray) System.out.println(str);

        //Copy Array
        int[] oldIntArray = {1,2,3};
        int[] newIntArray1 = new int[5];
        int[] newIntArray2 = new int[5];

        for(int i = 0; i < oldIntArray.length; i++) newIntArray1[i] = oldIntArray[i];            //Normal Way to copy array
        System.arraycopy(oldIntArray, 0, newIntArray2, 0, oldIntArray.length);   //using system method to copy array

        for(int integer : newIntArray1) System.out.print(integer + " ");
        System.out.println();
        for(int integer : newIntArray2) System.out.print(integer + " ");
        System.out.println();

        //enumeration constant -> Declared Week enumration constant on top
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }
        System.out.println("Today : " + today);

        //Usage of name, ordinal, compareTo, Valueof method
        String Day = today.name();
        int ordinal = today.ordinal();
        int compare1 = today.compareTo(Week.MONDAY);
        int compare2 = Week.MONDAY.compareTo(today);
        System.out.println("Today : " + Day + ", Index : " + ordinal + ", Compare to Monday : " + compare1 + ", Opposite : " + compare2);
        
        Week weekDay = Week.valueOf("WEDNESDAY");
        System.out.println(weekDay);
        Week[] days = Week.values();
        for(Week day : days) System.out.println(day);

        
    }
}