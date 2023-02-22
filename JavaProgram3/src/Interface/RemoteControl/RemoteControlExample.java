package Interface.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl rc1 = new Television();
        RemoteControl rc2 = new Audio();
        RemoteControl rc3 = new RemoteControl() {
            private int volume;

            public void turnOn(){}
            public void turnOff(){}
            public void setVolume(int volume){this.volume = volume;}
        };
    }
}
