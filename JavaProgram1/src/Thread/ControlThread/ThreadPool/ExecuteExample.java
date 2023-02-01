package Thread.ControlThread.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run(){
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[Thread Counts: " + poolSize + "] WorkThread Name: " + threadName);
                    int value = Integer.parseInt("삼");
                }
            };

            executorService.execute(runnable);
            //executorService.submit(runnable);

            Thread.sleep(1000);
        }
        executorService.shutdown();
    }
}
