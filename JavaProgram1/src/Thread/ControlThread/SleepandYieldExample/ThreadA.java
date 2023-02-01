package Thread.ControlThread.SleepandYieldExample;

public class ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while(!stop){
            if(work){System.out.println("ThreadA works!");}
            else{Thread.yield();}
        }
        System.out.println("ThreadA stops!");
    }
}
