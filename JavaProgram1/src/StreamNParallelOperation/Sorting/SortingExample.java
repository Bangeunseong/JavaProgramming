package StreamNParallelOperation.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args){
        IntStream intStream = Arrays.stream(new int[] {5,4,2,1,3});
        intStream.sorted().forEach(e->System.out.print(e + ","));
        System.out.println();

        List<Student> studentList = Arrays.asList(
            new Student("Honggildong", 30),
            new Student("ShinRamen", 10),
            new Student("Yumison", 20)
        );
        
        //Using Student class comparable interface
        studentList.stream().sorted().forEach(name->System.out.print(name.getScore() + ","));
        System.out.println();
        
        //Using Comparator
        studentList.stream().sorted(Comparator.reverseOrder()).forEach(name->System.out.print(name.getScore() + ","));
        System.out.println();
        
        //Anonymous Comparator
        studentList.stream().sorted((a,b)->{
            if(a.getScore() < b.getScore()) return 1;
            else if(a.getScore() == b.getScore()) return 0;
            else return -1;
        })
        .forEach(name->System.out.print(name.getScore() + ","));

    }
}
