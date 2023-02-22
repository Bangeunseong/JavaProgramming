package Thread.ThreadState.Control.ThreadPool;

public class ThreadB extends Thread {
    private WorkObject workObject;

    public ThreadB(ThreadGroup threadGroup, WorkObject workObject){
        super(threadGroup, "ThreadB"); this.workObject = workObject;
    }

    @Override
    public void run(){
        for(;;) workObject.methodB();
    }
}
