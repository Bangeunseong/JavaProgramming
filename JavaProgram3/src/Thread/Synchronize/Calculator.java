package Thread.Synchronize;

public class Calculator {
    private int memory;

    public int getMemory(){return memory;}

    public void setMemory(int memory){
        synchronized(this){
            this.memory = memory;
            try{Thread.sleep(10);}
            catch(InterruptedException e){}
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
