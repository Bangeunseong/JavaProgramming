package Interface.Soundable;

public class Dog implements Soundable {
    private static String soundDog;
    static{soundDog = "Bark";}

    public String sound(){return soundDog;}
}
