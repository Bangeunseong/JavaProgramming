package Thread.ThreadExample;

public class ThreadExample {
    public static void main(String[] args){
        Thread thread1 = new MovieThread();
        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.setDaemon(true);
        thread2.start();

        try{Thread.sleep(3000);}catch(InterruptedException e){}
    }
}
