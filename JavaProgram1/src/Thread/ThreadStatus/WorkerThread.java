package Thread.ThreadStatus;

import java.awt.Toolkit;
public class WorkerThread extends Thread {
    public WorkerThread(){setName("WorkerThread");}

    @Override
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++){
            System.out.println("Beep!");
            toolkit.beep();
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
