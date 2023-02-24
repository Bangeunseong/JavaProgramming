package Lambda.BasicAPI.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
    public static List<Student> list = Arrays.asList(
        new Student("Hogngildong", 90, 96),
        new Student("Kimyeonggyu", 95, 93)
    );

    public static void printString(Function<Student,String> function){
        for(Student student : list){
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
        for(Student student : list){
            sum += function.applyAsInt(student);
        }
        return (double)sum/list.size();
    }

    public static void main(String[] args){
        System.out.print("StudentList: "); printString(s->s.getName());
        System.out.print("EnglishScore: "); printInt(s->s.getEnglishScore());
        System.out.print("MathScore: "); printInt(s->s.getMathScore());

        double englishAvg = avg(s->s.getEnglishScore());
        System.out.println("EnglishAvg: " + englishAvg);

        double mathAvg = avg(s->s.getMathScore());
        System.out.println("MathAvg: " + mathAvg);
    }
}
