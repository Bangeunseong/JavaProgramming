package Interface.RemoteControl;

public class SurroundAudio extends Audio{
    private int volume;
    private boolean mute;

    public void setVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME){this.volume = RemoteControl.MAX_VOLUME;}
        else if(volume < RemoteControl.MIN_VOLUME){this.volume = RemoteControl.MIN_VOLUME;}
        else this.volume = volume;

        System.out.println("Current Volume: " + this.volume);
    }

    @Override
    public void setMute(boolean mute){
        this.mute = mute;
        if(this.mute){System.out.println("Audio Muted!");}
        else{System.out.println("Audio unmuted!");}
    }
}
