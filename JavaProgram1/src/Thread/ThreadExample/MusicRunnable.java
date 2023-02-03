package Thread.ThreadExample;

public class MusicRunnable implements Runnable {
    @Override
    public void run(){
        while(true){
            System.out.println("Music Playing!");
            try{Thread.sleep(1000);}catch(InterruptedException e){break;}
        }
    }
}
