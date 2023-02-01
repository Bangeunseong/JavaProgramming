package Thread.ThreadStatus;

public class Calculator {//public object
    private int memory;

    public int getMemory(){return memory;}

    //Using synchronized method
    public synchronized void setMemory(int memory){//synchronized initialization is important
        this.memory = memory;
        try{Thread.sleep(200);}catch(InterruptedException e){}
        System.out.println(Thread.currentThread().getName() +": " + this.memory);
    }
    
    //Using synchronized block
    /*public void setMemory(int memory){
        synchronized(this){
            this.memory = memory;
            try{Thread.sleep(200);}catch(InterruptedException e){}
            System.out.println(Thread.currentThread().getName() +": " + this.memory);
        }
    }*/
}
