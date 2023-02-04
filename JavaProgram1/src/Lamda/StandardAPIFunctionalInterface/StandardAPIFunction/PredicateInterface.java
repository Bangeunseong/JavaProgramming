package Lamda.StandardAPIFunctionalInterface.StandardAPIFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    private static List<Student> S_list = Arrays.asList(
        new Student("Honggildong","Male", 85, 90),
        new Student("Kimseohyeon", "Female", 90, 95),
        new Student("Kimjava", "Male", 92, 95),
        new Student("Parkhanna", "Female", 84, 99)
    );

    public static double avg(Predicate<Student> predicate){
        int count = 0; double sum = 0;
        for(Student student : S_list){
            if(predicate.test(student)){
                count++; sum += ((student.getmathScore() + student.getenglishScore()) / 2.0);
            }
        }
        return (double)sum/count;
    }

    public static void main(String[] args){
        double maleAvg = avg(t->t.getGender().equals("Male"));
        System.out.println("Male average score: " + maleAvg);

        double femaleAvg = avg(t->t.getGender().equals("Female"));
        System.out.println("Female average score: " + femaleAvg);
    }
}
