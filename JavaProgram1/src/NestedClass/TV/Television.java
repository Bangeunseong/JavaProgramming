package NestedClass.TV;

public class Television {
    /* Class field initialization */
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn(){
            System.out.println("Turning on Television!");
        }
        @Override
        public void turnOff(){
            System.out.println("Turning off Television!");
        }
    };

    /* Local field initialization */
    void method(){
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn(){
                System.out.println("Turning on Television! _ Using method");
            }

            @Override
            public void turnOff(){
                System.out.println("Turning off Television! _ Using method");
            }
        };
        rc.turnOn();
    }

    /* Using Local method */
    void childmethod(RemoteControl rc){
        rc.turnOn();
    }
}
