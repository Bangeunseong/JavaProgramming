package Thread.ThreadStatus;

import java.awt.*;
public class BeepPrintExample implements Runnable {
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
