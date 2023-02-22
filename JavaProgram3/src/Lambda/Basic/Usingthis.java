package Lambda.Basic;

public class Usingthis {
    public int outterField = 10;

    class Inner{
        int innerField = 20;
        void method(){
            MyFunctionalInterface1 fi = ()->{
                System.out.println("outterField: " + outterField);
                System.out.println("outterField: " + Usingthis.this.outterField);

                System.out.println("innerField: " + innerField);
                System.out.println("innerField: " + this.innerField);
            };
            fi.method();
        }
    }
}
