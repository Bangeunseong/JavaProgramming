package Basics;

public class Service {
    @Annotation
    public void method1(){
        System.out.println("Execution1");
    }
    @Annotation(value = "*")
    public void method2(){
        System.out.println("Execution2");
    }
    @Annotation(value = "#", repeat = 20)
    public void method3(){
        System.out.println("Execution3");
    }
}
