package StreamNParallelOperation.ParallelOperation.SequentialVSParallel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistVsLinkedListExample {
    public static void work(int value){}

    public static long testParallel(List<Integer> list){
        long start = System.nanoTime();
        list.stream().parallel().forEach(a->work(a));
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 1000000; i++){arrayList.add(i); linkedList.add(i);}

        long arrayListParallel = testParallel(arrayList);
        long linkedListParallel = testParallel(linkedList);

        arrayListParallel = testParallel(arrayList);
        linkedListParallel = testParallel(linkedList);

        //If objects are not many linkedlist is faster than arraylist
        //else objects art many arraylist is faster than linkedlist
        System.out.println("ArrayList: " + arrayListParallel + "\nLinkedList: " + linkedListParallel);
        if(arrayListParallel < linkedListParallel){System.out.println("Result: ArrayList operation is faster!");}
        else {System.out.println("Result: LinkedList operation is faster!");}
    }
}
