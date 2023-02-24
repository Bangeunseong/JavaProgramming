package Lambda.BasicAPI.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
        new Student("Honggildong", "MALE", 90),
        new Student("Kimyeongsu", "FEMALE", 90),
        new Student("Kimjava", "MALE", 95),
        new Student("Parkhanna", "FEMALE", 92)
    );

    public static double avg(Predicate<Student> predicate){
        int count = 0, sum = 0;
        for(Student student : list){
            if(predicate.test(student)){count++; sum += student.getScore();}
        }
        return (double)sum/count;
    }

    public static void main(String[] args){
        double maleAvg = avg(s->s.getSex().equals("MALE"));
        System.out.println("MALE score average: " + maleAvg);

        double femaleAvg = avg(s->s.getSex().equals("FEMALE"));
        System.out.println("FEMALE score Average: " + femaleAvg);
    }
}
