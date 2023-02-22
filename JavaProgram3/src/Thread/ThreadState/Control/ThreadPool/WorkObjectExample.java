package Thread.ThreadState.Control.ThreadPool;

public class WorkObjectExample {
    public static void main(String[] args){
        WorkObject sharedObject = new WorkObject();
        ThreadGroup threadGroup = new ThreadGroup("MyGroup");

        ThreadA threadA = new ThreadA(threadGroup, sharedObject);
        ThreadB threadB = new ThreadB(threadGroup, sharedObject);
        threadA.setDaemon(true);
        threadB.setDaemon(true);
        threadA.start();
        threadB.start();

        try{Thread.sleep(100);}
        catch(InterruptedException e){}
        threadGroup.interrupt();
    }
}
