package Thread.ControlThread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("[Procedure execution request]");
        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                int sum = 0;
                for(int i = 1; i <= 10; i++) sum += i;
                System.out.println("[Result] " + sum);
            }
        };
        
        Future future = executorService.submit(runnable);
        try{future.get(); System.out.println("Procedure Completed!");}
        catch(Exception e){System.out.println("[Exception occured] " + e.getMessage());}

        executorService.shutdown();
    }
}
