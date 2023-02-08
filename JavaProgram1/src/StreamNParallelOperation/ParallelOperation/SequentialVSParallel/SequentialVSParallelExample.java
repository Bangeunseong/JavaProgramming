package StreamNParallelOperation.ParallelOperation.SequentialVSParallel;

import java.util.Arrays;
import java.util.List;

public class SequentialVSParallelExample {
    public static void work(int value){
        try{Thread.sleep(100);}catch(InterruptedException e){}
    }

    //Sequencial
    public static long testSequencial(List<Integer> list){
        long start = System.nanoTime();
        list.stream().forEach(a->work(a));
        long end = System.nanoTime();
        return end - start;
    }

    //Parallel
    public static long testParallel(List<Integer> list){
        long start = System.nanoTime();
        list.parallelStream().forEach(a->work(a));
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8);

        //getting sequencial operation time
        long timeSequencial = testSequencial(list);

        //getting parallel operation time
        long timeParallel = testParallel(list);

        System.out.println(timeSequencial + "\n" + timeParallel);
        if(timeSequencial < timeParallel){System.out.println("Result: Sequencial operation is faster!");}
        else{System.out.println("Result: Parallel operation is faster!");}
    }
}
