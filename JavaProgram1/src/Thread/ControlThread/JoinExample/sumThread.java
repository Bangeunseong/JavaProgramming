package Thread.ControlThread.JoinExample;

public class sumThread extends Thread {
    private long sum;

    public long getsum(){return sum;}
    public void setSum(long sum){this.sum = sum;}
    public void run(){
        for(int i = 1; i <= 100; i++) sum += i;
    }
}
