package Thread.ThreadStatus;

import java.awt.*;
public class ThreadClass {
    public static void main(String[] args){
        //Using Class
        Runnable beepTask = new BeepPrintExample();
        Thread thread = new Thread(beepTask);
        thread.start();

        //Using anonymous Runnable object
        Thread thread_anonymous = new Thread(new Runnable() {
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0;i < 5; i++){
                    System.out.println("Beep!");
                    toolkit.beep();
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        });
        thread_anonymous.start();
        
        //Using Lamda
        Thread thread_Lamda = new Thread(()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i = 0; i < 5; i++){
                System.out.println("Beep!");
                toolkit.beep();
                try{Thread.sleep(500);}catch(Exception e){}
            }
        });
        thread_Lamda.start();

        //Using WorkerThread
        Thread thread_WorkerThread = new WorkerThread();
        thread_WorkerThread.start();

        //Using anonymous Thread object
        Thread thread_anonymousThread = new Thread(){
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                System.out.println("Beep!");
                toolkit.beep();
                try{Thread.sleep(500);}catch(Exception e){}
            }
        };
        thread_anonymousThread.start();

        //Thread Name
        Thread mainThread = Thread.currentThread();
        System.out.println("Program start Thread: " + mainThread.getName());//Main Thread Name
        System.out.println("WorkerThread: " + thread_WorkerThread.getName());//thread_WorkerThread Name
        System.out.println("AnonymousThread Name: " + thread_anonymousThread.getName());//thread_anonymousThread Name

        //Thread priority
        for(int i = 1 ; i <= 10; i++){
            Thread calcThread = new CalcThread("Thread" + i);
            if(i != 10){calcThread.setPriority(Thread.MIN_PRIORITY);}
            else{calcThread.setPriority(Thread.MAX_PRIORITY);}
            calcThread.start();
        }

        //Syncing method syncing block
        //Example -> Using Calculator, User1, User2 object
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();

        //Thread Status
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }
}
