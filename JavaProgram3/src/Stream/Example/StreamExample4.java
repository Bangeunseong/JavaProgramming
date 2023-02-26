package Stream.Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args){
        List<Employee> list = Arrays.asList(
            new Employee("Honggildong", "Developer"),
            new Employee("Kimnari", "Designer"),
            new Employee("Shinyeongman", "Developer")
        );

        Map<String, List<String>> groupingMap = list.stream()
        .collect(
            Collectors.groupingBy(
                Employee::getJob, Collectors.mapping(Employee::getName, Collectors.toList())
            )
        );
        System.out.print("[Developer] ");
        groupingMap.get("Developer").stream().forEach(s->System.out.print(s + " "));
        System.out.print("\n[Designer] ");
        groupingMap.get("Designer").stream().forEach(s->System.out.print(s + " "));
        System.out.println();
    }
} 
