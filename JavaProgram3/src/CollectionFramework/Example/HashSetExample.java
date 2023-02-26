package CollectionFramework.Example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "Honggildong"));
        set.add(new Student(2, "Shinjyeongmu"));
        set.add(new Student(1, "James"));

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.studentNo+":"+student.name);
        }
    }
}
