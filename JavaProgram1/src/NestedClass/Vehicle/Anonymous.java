package NestedClass.Vehicle;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println("Bicycle is running!");
        }
    };
    void method1(){
        Vehicle field = new Vehicle() {
            @Override
            public void run(){
                System.out.println("Personal Car is running!");
            }
        };
        field.run();
    }
    void method2(Vehicle v){
        v.run();
    }
}
