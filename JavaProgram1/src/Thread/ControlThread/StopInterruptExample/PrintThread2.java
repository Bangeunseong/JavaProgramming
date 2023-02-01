package Thread.ControlThread.StopInterruptExample;

public class PrintThread2 extends Thread {
    public void run(){
        while(true){
            System.out.println("Executing!");
            if(Thread.interrupted()) break;
        }
        System.out.println("Resource Managing!");
        System.out.println("Procedure Eliminated!");
    }
}
