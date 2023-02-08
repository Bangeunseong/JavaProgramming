package StreamNParallelOperation.StreamPipeLine;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLinesExample {
    public static void main(String[] args){
        List<Member> list = Arrays.asList(
            new Member("Honggildong", Member.MALE,30),
            new Member("Kimnari", Member.FEMALE, 20),
            new Member("Shinyeonggeon", Member.MALE, 45),
            new Member("Parksumi", Member.FEMALE, 27)
        );

        double ageAvg = list.stream().filter(m->m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
        System.out.println("Male average age: " + ageAvg);
    }
}
