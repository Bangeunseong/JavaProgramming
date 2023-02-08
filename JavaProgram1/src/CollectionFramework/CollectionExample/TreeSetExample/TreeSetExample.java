package CollectionFramework.CollectionExample.TreeSetExample;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<Student> treeSet = new TreeSet<Student>();
        //TreeSet<Student> treeSet = new TreeSet<Student>(new ScoreComparator()); -> Using comparator
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("Best score: " + student.score);
        System.out.println("ID: " + student.id);
    }
}
