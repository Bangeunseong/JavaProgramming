package Thread.ControlThread.SleepandYieldExample;

import java.awt.*;
public class SleepExample extends Thread{
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 10; i++){
            toolkit.beep();
            try{Thread.sleep(3000);}catch(InterruptedException e){}
        }
    }
}
