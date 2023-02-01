package Thread.ControlThread.ThreadGroupExample;

public class ThreadGroupExample {
    public static void main(String[] args){
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
        workThreadA.start();
        workThreadB.start();

        System.out.println("[Main Thread Group list() method Print consequence]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try{Thread.sleep(1000);}catch(InterruptedException e){}

        System.out.println("[myGroup Thread Group interrupt() method Print consequence]");
        myGroup.interrupt();
    }
}
