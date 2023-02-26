package Stream.StreamPipeline;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExample {
    public static void main(String[] args){
        List<Member> list = Arrays.asList(
            new Member("Honggildong", Member.MALE, 30),
            new Member("Kimnari", Member.FEMALE, 20),
            new Member("Shinmyeonggu", Member.MALE, 45),
            new Member("Parksumi", Member.FEMALE, 27)
        );

        double avg = list.stream()
        .filter(m->m.getSex()==Member.MALE).mapToInt(Member::getAge)
        .average().getAsDouble();
        System.out.println("Male age average: " + avg);
    }
}
