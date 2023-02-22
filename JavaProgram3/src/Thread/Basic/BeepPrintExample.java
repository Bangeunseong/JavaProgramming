package Thread.Basic;

public class BeepPrintExample {
    public static void main(String[] args){
        /*BeepTask beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();*/

        Thread thread = new BeepThread();
        thread.start();

        for(int i = 0; i < 5; i++){
            System.out.println("Beep");
            try{Thread.sleep(500);} catch(InterruptedException e){}
        }
    }
}
