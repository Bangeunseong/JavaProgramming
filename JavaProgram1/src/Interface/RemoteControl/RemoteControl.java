package Interface.RemoteControl;

public interface RemoteControl {
    //Variable
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //Abstract Method
    public void TurnOn();
    public void TurnOff();
    public void setVolume(int volume);

    //Default Method
    default void setMute(boolean mute){
        if(mute){System.out.println("Volume Muted!");}
        else{System.out.println("Volume unmuted!");}
    }

    //Static Method
    static void ChangeBattery(){System.out.println("Change Battery!");}
}
