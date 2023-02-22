package Thread.ThreadState.Method;

public class ThreadA extends Thread {
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while(!stop){
            if(work){System.out.println("ThreadA content");}
            else Thread.yield();
        }
        System.out.println("ThreadA ended");
    }
}
