package CollectionFramework.CollectionExample.HashSetExample;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args){
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "Honggildong"));
        set.add(new Student(2, "Henry davison"));
        set.add(new Student(1, "Charming jo"));

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.studentNum + ":" + student.name);
        }
    }
}
