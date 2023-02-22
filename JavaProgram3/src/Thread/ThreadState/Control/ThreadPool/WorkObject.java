package Thread.ThreadState.Control.ThreadPool;

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("ThreadA methodA() executed");
        notify();
        try{wait();}
        catch(InterruptedException e){}
    }

    public synchronized void methodB(){
        System.out.println("ThreadB methodB() executed");
        notify();
        try{wait();}
        catch(InterruptedException e){}
    }
}
