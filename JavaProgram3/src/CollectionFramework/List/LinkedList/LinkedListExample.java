package CollectionFramework.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime, endTime;

        startTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++) list1.add(String.valueOf(i));
        endTime = System.nanoTime();
        System.out.println("Time spent in ArrayList: " + (endTime - startTime));

        startTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++) list2.add(String.valueOf(i));
        endTime = System.nanoTime();
        System.out.println("Time spent in LinkedList: " + (endTime - startTime));
    }
}
