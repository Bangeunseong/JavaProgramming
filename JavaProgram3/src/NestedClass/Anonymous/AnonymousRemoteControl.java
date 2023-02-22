package NestedClass.Anonymous;

public class AnonymousRemoteControl {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn(){System.out.println("Turning on TV");}
        @Override
        public void turnOff(){System.out.println("Turning off TV");}
    };

    void method1(){
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn(){System.out.println("Turning on Audio");}
            @Override
            public void turnOff(){System.out.println("Turning off Audio");}
        };
        localVar.turnOn();
    }

    void method2(RemoteControl rc){rc.turnOn();}
}
