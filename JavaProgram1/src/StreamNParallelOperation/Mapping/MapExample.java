package StreamNParallelOperation.Mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(
            new Student("Honggildong",10),
            new Student("Shingyeonwoo",20),
            new Student("Yumison",30)
        );

        studentList.stream().mapToInt(Student::getScore).forEach(s->System.out.println(s));
    }
}
