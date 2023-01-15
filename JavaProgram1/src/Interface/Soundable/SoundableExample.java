package Interface.Soundable;

public class SoundableExample {
    private static void PrintSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
    public static void main(String[] args){
        PrintSound(new Dog());
        PrintSound(new Cat());
    } 
}
