package Thread.ControlThread.WaitNotifyExample.DataBox;

public class DataBox {
    private String data;

    public synchronized String getData(){
        if(this.data == null){try{wait();}catch(InterruptedException e){}}
        String returnValue = data;
        System.out.println("Read data in ConsumerThread: " + returnValue);
        data = null; notify();
        return returnValue;
    }

    public synchronized void setData(String data){
        if(this.data != null){try{wait();}catch(InterruptedException e){}}
        this.data = data;
        System.out.println("Produced data in ProducerThread: " + data);
        notify();
    }
}
