package Thread.ThreadState.Control.ResultSaving;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );

        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                int sum = 0;
                for(int i = 1; i <= 10; i++) sum+=i;
                System.out.println("Result: " + sum);
            }
        };

        Future future = executorService.submit(runnable);

        try{future.get();}
        catch(Exception e){e.getMessage();}

        executorService.shutdown();
    }
}
