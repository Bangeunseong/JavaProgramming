package Thread.ThreadState.Control.ThreadPool;

public class ThreadA extends Thread {
    private WorkObject workObject;

    public ThreadA(ThreadGroup threadGroup, WorkObject workObject){
        super(threadGroup, "ThreadA"); this.workObject = workObject;
    }

    @Override
    public void run(){
        for(;;) workObject.methodA();
    }
}
