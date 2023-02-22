package BasicAPI.ObjectClass.CurrentTime;

public class SystemTimeExample {
    public static void main(String[] args){
        long time1 = System.nanoTime();

        int sum = 0;
        for(int i = 1; i <= 1000000; i++) sum += i;

        long time2 = System.nanoTime();

        System.out.println("Result: " + sum);
        System.out.println("Calculation time: " + (time2 - time1) +"ns");
    }
}
