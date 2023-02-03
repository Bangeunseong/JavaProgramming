package Lamda;

public class LambdaExample {
    public static void main(String[] args){
        Runnable runnable = ()->{
            int sum = 0;
            for(int i = 0; i < 10; i++) sum += i;
            System.out.println(sum);
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
