package Lambda.Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaExample3 {
    private static List<Student> students = Arrays.asList(
        new Student("Honggildong", 90, 96),
        new Student("Shingildong", 95, 93)
    );

    public static double avg(Function<Student, Integer> function){
        int sum = 0;
        for(Student student : students){
            sum += function.apply(student);
        }
        return (double)sum/students.size();
    }

    public static void main(String[] args){
        double englishAvg = avg(s->s.getEnglishScore());
        System.out.println("EnglishScore Average: " + englishAvg);

        double mathAvg = avg(s->s.getMathScore());
        System.out.println("MathScore Average: " + mathAvg);
    }
}
