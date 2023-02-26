package Stream.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
            new Student("Honggildong", 10, Student.Sex.MALE, Student.City.Seoul),
            new Student("Kimsumi", 6, Student.Sex.FEMALE, Student.City.Busan),
            new Student("Shinyeongman", 10, Student.Sex.MALE, Student.City.Busan),
            new Student("Parksumi", 6, Student.Sex.FEMALE, Student.City.Seoul)
        );

        Map<Student.Sex,List<Student>> mapBySex = totalList.stream()
        .collect(Collectors.groupingBy(Student::getSex));

        System.out.println("[Male Students]");
        mapBySex.get(Student.Sex.MALE).stream()
        .forEach(s->System.out.print(s.getName() + " "));
        System.out.println();

        System.out.println("[Female Students]");
        mapBySex.get(Student.Sex.FEMALE).stream()
        .forEach(s->System.out.print(s.getName() + " "));
        System.out.println();

        System.out.println();
        
        Map<Student.City,List<Student>> mapByCity = totalList.stream()
        .collect(Collectors.groupingBy(Student::getCity));

        System.out.println("[Seoul]");
        mapByCity.get(Student.City.Seoul).stream()
        .forEach(s->System.out.print(s.getName() + " "));
        System.out.println();

        System.out.println("[Busan]");
        mapByCity.get(Student.City.Busan).stream()
        .forEach(s->System.out.print(s.getName() + " "));
        System.out.println();
    }
}
