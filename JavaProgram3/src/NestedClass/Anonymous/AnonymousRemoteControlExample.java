package NestedClass.Anonymous;

public class AnonymousRemoteControlExample {
    public static void main(String[] args){
        AnonymousRemoteControl anonymous = new AnonymousRemoteControl();
        anonymous.field.turnOn();
        anonymous.method1();
        anonymous.method2(new RemoteControl(){
            @Override
            public void turnOn(){System.out.println("Turning on SmartTV");}
            @Override
            public void turnOff(){System.out.println("Turning off SmartTV");}
        });
    }
}
