package Thread.ControlThread.WaitNotifyExample.WorkObject;

public class ThreadB_W extends Thread {
    private WorkObject workObject;

    public ThreadB_W(WorkObject workObject){this.workObject = workObject;}
    @Override
    public void run(){
        for(int i = 0; i < 10; i++) workObject.methodB();
    }
}
