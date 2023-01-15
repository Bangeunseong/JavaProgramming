package Inheritance;

public class Car {
    Tire[] tires = {
        new HankookTire("Front Left", 6),
        new HankookTire("Front Right", 5),
        new HankookTire("Back Left", 7),
        new HankookTire("Back Right", 8)
    };

    void stop(){
        System.out.println("[Car stops running!]");
    }

    int run(){
        System.out.println("[Car starts running!]");
        if(tires[0].roll() == false) {stop(); return 1;}
        if(tires[1].roll() == false) {stop(); return 2;}
        if(tires[2].roll() == false) {stop(); return 3;}
        if(tires[3].roll() == false) {stop(); return 4;}
        return 0;
    }
}
