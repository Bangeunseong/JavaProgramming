package Thread.ControlThread.WaitNotifyExample.WorkObject;

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("ThreadA's methodA() executed!");
        notify();
        try{wait();}catch(InterruptedException e){}
    }
    public synchronized void methodB(){
        System.out.println("ThreadB's methodB() executed!");
        notify();
        try{wait();}catch(InterruptedException e){}
    }
}
