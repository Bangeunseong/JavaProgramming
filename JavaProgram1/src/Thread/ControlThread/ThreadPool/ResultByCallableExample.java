package Thread.ControlThread.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("[Procedure execution request]");
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception{
                int sum = 0;
                for(int i = 1; i <= 10; i++) sum += i;
                return sum;
            }
        };

        Future<Integer> future = executorService.submit(callable);

        try{
            int sum = future.get();
            System.out.println("[Result] " + sum);
            System.out.println("[Procedure Completed!]");
        }
        catch(Exception e){System.out.println("[Exception occured!] " + e.getMessage());}

        executorService.shutdown();
    }
}
