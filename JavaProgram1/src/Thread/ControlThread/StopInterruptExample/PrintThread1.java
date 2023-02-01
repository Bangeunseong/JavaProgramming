package Thread.ControlThread.StopInterruptExample;

public class PrintThread1 extends Thread {
    private boolean stop;

    public void setStop(boolean stop){this.stop = stop;}

    @Override
    public void run(){
        while(!stop){System.out.println("Executing!");}
        System.out.println("Resource Managing");
        System.out.println("Stop procedure!");
    }
}
