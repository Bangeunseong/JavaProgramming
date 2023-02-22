package Thread.Basic;

public class ThreadNameExample {
    public static void main(String[] args){
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread name: " + mainThread.getName());

        Thread threadA = new ThreadA();
        System.out.println("WorkThread: " + threadA.getName());
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("WorkThread: " + threadB.getName());
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadB.start();
    }
}
