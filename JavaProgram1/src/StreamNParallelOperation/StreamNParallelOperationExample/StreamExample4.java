package StreamNParallelOperation.StreamNParallelOperationExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args){
        List<MemberInfo> list = Arrays.asList(
            new MemberInfo("Honggildong", "Developer"),
            new MemberInfo("Kimnari", "Designer"),
            new MemberInfo("JasonRoman", "Developer")
        );

        Map<String, List<String>> groupingMap = list.stream()
        .collect(
            Collectors.groupingBy(
                MemberInfo::getJob, 
                Collectors.mapping(MemberInfo::getName, Collectors.toList())
            )
        );

        System.out.print("[Developer] ");
        groupingMap.get("Developer").stream().forEach(s->System.out.print(s + " "));
        System.out.println();
        System.out.print("[Designer] ");
        groupingMap.get("Designer").stream().forEach(s->System.out.print(s + " "));
    }
}
