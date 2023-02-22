package Interface.RemoteControl;

public class Television implements RemoteControl {
    private int volume;

    public void turnOn(){System.out.println("Turning on Television!");}
    public void turnOff(){System.out.println("Turning off Television!");}
    public void setVolume(int volume){
        if(volume > MAX_VOLUME) this.volume = MAX_VOLUME;
        else if(volume < MIN_VOLUME) this.volume = MIN_VOLUME;
        else this.volume = volume;

        System.out.println("Current TV Volume: " + volume);
    }
}
