package Thread.ThreadStatus;

public class TargetThread extends Thread{
    public void run(){
        for(long i = 0; i < 10000000; i++){}
        try{Thread.sleep(1500);}
        catch(Exception e){}
        for(long i = 0; i < 10000000; i++){}
    }
}
