package Lamda.FunctionalInterface;

public class UsingThis {
    public int outterfield = 10;

    class Inner{
        int innerfield = 20;
        void method(){
            MyFunctionalInterface1 fi = ()->{
                int outterfield = 30;
                int innerfield = 40;
                System.out.println("outterField: " + outterfield);
                System.out.println("outterField: " + UsingThis.this.outterfield + "\n");

                System.out.println("innerField: " + innerfield);
                System.out.println("innerField: " + this.innerfield);
            };
            fi.method();
        }
    }
}
