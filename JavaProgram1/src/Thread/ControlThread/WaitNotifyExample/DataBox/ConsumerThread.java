package Thread.ControlThread.WaitNotifyExample.DataBox;

import java.util.function.Consumer;

public class ConsumerThread extends Thread {
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox){this.dataBox = dataBox;}
    @Override
    public void run(){
        for(int i = 0; i < 3; i++) {String data = dataBox.getData();}
    }
}
