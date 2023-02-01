package Thread.ControlThread.JoinExample;

public class JoinExample {
    public static void main(String[] args){
        sumThread sThread = new sumThread();
        sThread.start();

        try{sThread.join();}catch(InterruptedException e){}
        System.out.println("Sum of 1~100: " + sThread.getsum());
    }
}
