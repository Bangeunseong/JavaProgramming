package Interface.RemoteControl;

public class Audio implements RemoteControl {
    private int volume;
    private boolean mute;

    public void turnOn(){System.out.println("Turning on Audio!");}
    public void turnOff(){System.out.println("Turning off Audio!");}
    public void setVolume(int volume){
        if(volume > MAX_VOLUME) this.volume = MAX_VOLUME;
        else if(volume < MIN_VOLUME) this.volume = MIN_VOLUME;
        else this.volume = volume;

        System.out.println("Current Audio Volume: " + volume);
    }

    @Override
    public void setMute(boolean mute){
        this.mute = mute;
        if(mute){System.out.println("Muting Audio");}
        else {System.out.println("Unmuting Audio");}
    }
}
