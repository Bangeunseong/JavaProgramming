package Thread.ControlThread.WaitNotifyExample.WorkObject;

public class WaitNotifyExample {
    public static void main(String[] args){
        WorkObject workObject = new WorkObject();

        ThreadA_W threadA_W = new ThreadA_W(workObject);
        ThreadB_W threadB_W = new ThreadB_W(workObject);
        threadA_W.start();
        threadB_W.start();
    }
}
