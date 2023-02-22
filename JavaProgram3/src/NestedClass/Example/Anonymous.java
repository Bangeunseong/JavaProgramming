package NestedClass.Example;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run(){System.out.println("Running bicycle");}
    };

    void method1(){
        Vehicle localVar = new Vehicle() {
            @Override
            public void run(){System.out.println("Running car");}
        };
        localVar.run();
    }

    void method2(Vehicle v){v.run();}
}
