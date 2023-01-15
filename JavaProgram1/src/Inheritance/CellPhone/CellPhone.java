package Inheritance.CellPhone;

public class CellPhone {
    String model;
    String color;

    //Constructor
    CellPhone(String model, String color){this.model = model; this.color = color;}

    //Method
    void PowerOn(){System.out.println("Turning on Power");}
    void PowerOff(){System.out.println("Turning off Power");}
    void bell(){System.out.println("Ringing Bell");}
    void sendVoice(String message){System.out.println("You : " + message);}
    void receiveVoice(String message){System.out.println("Someone : " + message);}
    void hangUp(){System.out.println("Hanging up the phone");}
}
