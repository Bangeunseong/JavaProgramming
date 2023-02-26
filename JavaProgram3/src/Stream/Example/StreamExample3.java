package Stream.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args){
        List<Employee> list = Arrays.asList(
            new Employee("Honggildong", "Developer"),
            new Employee("Kimnari", "Designer"),
            new Employee("Shinyeongman", "Developer")
        );

        List<Employee> developers = list.stream()
        .filter(a->a.getJob().equals("Developer"))
        .collect(Collectors.toList());

        developers.stream().forEach(s->System.out.println(s.getName()));
    }
}
