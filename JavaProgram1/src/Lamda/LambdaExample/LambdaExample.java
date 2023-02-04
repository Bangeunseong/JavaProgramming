package Lamda.LambdaExample;

import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

public class LambdaExample {
    private static int[] scores = {10,50,3};

    public static int method(int x, int y){
        IntSupplier supplier = ()->{    
            int modified_x = x * 10;
            int result = modified_x + y;
            return result;
        };
        int result = supplier.getAsInt();
        return result;
    }

    public static int maxOrmin(IntBinaryOperator operator){
        int result = scores[0];
        for(int score:scores){
            result = operator.applyAsInt(score, result);
        }
        return result;
    }

    public static Student[] students ={
        new Student("Honggildong", 90, 96),
        new Student("Shinyonggeon", 95, 93)
    };

    public static double avg(ToIntFunction<Student> function){
        int sum = 0;
        for(Student student:students){
            sum += function.applyAsInt(student);
        }
        return (double)sum/students.length;
    }

    public static void main(String[] args){
        System.out.println(method(5, 4));

        int max = maxOrmin((x,y)->{
            if(x>=y) return x;
            return y;
        });
        System.out.println("Max: " + max);

        int min = maxOrmin((x,y)->{
            if(x<=y) return x;
            return y;
        });
        System.out.println("Min: " + min);

        double engAvg = avg(s->s.getEnglishScore());
        engAvg = avg(Student::getEnglishScore);
        System.out.println("Average english score: " + engAvg);

        double mathAvg = avg(s->s.getMathScore());
        mathAvg = avg(Student::getMathScore);
        System.out.println("Average math score: " + mathAvg);
    }
}
