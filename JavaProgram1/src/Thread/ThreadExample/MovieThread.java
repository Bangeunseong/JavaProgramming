package Thread.ThreadExample;

public class MovieThread extends Thread {
    @Override
    public void run(){
        while(true){
            System.out.println("Playing Movie!");
            try{Thread.sleep(1000);}catch(InterruptedException e){break;}
        }
    }
}
