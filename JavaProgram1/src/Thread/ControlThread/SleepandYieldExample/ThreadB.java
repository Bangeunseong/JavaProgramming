package Thread.ControlThread.SleepandYieldExample;

public class ThreadB extends Thread {
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while(!stop){
            if(work){System.out.println("ThreadB works!");}
            else{Thread.yield();}
        }
        System.out.println("ThreadB stops!");
    }
}
