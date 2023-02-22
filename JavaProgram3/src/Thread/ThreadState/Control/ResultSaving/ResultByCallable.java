package Thread.ThreadState.Control.ResultSaving;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallable {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );

        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception{
                int sum = 0;
                for(int i = 1; i <= 10; i++) sum += i;
                return sum;
            }
        };

        Future<Integer> future = executorService.submit(task);
        try{
            int sum = future.get();
            System.out.println("Result: " + sum);
        }
        catch(Exception e){System.out.println(e.getMessage());}
        executorService.shutdown();
    }
}
