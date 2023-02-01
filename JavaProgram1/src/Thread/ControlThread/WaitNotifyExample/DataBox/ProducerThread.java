package Thread.ControlThread.WaitNotifyExample.DataBox;

public class ProducerThread extends Thread {
    private DataBox dataBox;

    public ProducerThread(DataBox dataBox){this.dataBox = dataBox;}
    @Override
    public void run(){
        for(int i = 0 ; i < 3; i++){
            String data = "Data-" + (i+1);
            dataBox.setData(data);
        }
    }
}
