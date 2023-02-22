package Interface.Soundable;

public class Cat implements Soundable {
    private static String soundCat;
    static{soundCat = "Meow";}

    public String sound(){return soundCat;}
}
