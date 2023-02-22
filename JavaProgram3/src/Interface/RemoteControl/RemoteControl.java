package Interface.RemoteControl;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean Mute){
        if(Mute){System.out.println("Volume Muted!");}
        else{System.out.println("Mute disabled!");}
    }
    static void changeBattery(){System.out.println("Changing Battery!");}
}