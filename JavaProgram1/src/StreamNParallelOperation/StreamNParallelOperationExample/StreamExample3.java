package StreamNParallelOperation.StreamNParallelOperationExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args){
        List<MemberInfo> list = Arrays.asList(
            new MemberInfo("Honggildong","Developer"),
            new MemberInfo("Kimnari", "Designer"),
            new MemberInfo("Kimnuri", "Developer")
        );

        List<MemberInfo> developers = list.stream()
        .filter(s->s.getJob().equalsIgnoreCase("developer"))
        .collect(Collectors.toList());

        developers.stream().forEach(s->System.out.println(s.getName()));
    }
}
