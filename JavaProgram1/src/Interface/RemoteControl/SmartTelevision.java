package Interface.RemoteControl;

public class SmartTelevision extends Television implements Search  {
    private int volume;
    public void setVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME){this.volume = RemoteControl.MAX_VOLUME;}
        else if(volume < RemoteControl.MIN_VOLUME){this.volume = RemoteControl.MIN_VOLUME;}
        else this.volume = volume;

        System.out.println("Current Volume: " + this.volume);
    }
    public void SearchingURL(String URL){System.out.println("Searching "+ URL);}
}
