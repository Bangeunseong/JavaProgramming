package Lamda.StandardAPIFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionInterface {
    public static List<Student> list = Arrays.asList(
        new Student("Honggildong","Male", 90,96),
        new Student("Shinyonggueon","Female", 95, 93)
    );
    public static void printString(Function<Student,String> function){
        for(Student student:list){
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }
    public static void printInt(ToIntFunction<Student> function){
        for(Student student : list){
            System.out.print(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }
    public static double avg(ToIntFunction<Student> function){
        int sum = 0;
        for(Student student:list){
            sum += function.applyAsInt(student);
        }
        double avg = (double)sum/list.size();
        return avg;
    }
    public static void main(String[] args){
        System.out.println("[Students Name]");
        printString(t -> t.getName());

        System.out.println("[English Score]");
        printInt(t -> t.getenglishScore());

        System.out.println("[Math Score]");
        printInt(t -> t.getmathScore());

        double englishAvg = avg(s -> s.getenglishScore());
        System.out.println("English Average Score: " + englishAvg);

        double mathAvg = avg(s -> s.getmathScore());
        System.out.println("Math Average Score: " + mathAvg);
    }
}

