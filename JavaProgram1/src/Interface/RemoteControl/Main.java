package Interface.RemoteControl;

import Interface.Driver.Bus;
import Interface.Driver.Driver;
import Interface.Driver.Taxi;

public class Main {
    public static void main(String[] args){
        //Using Constructors
        RemoteControl rc;
        rc = new SurroundAudio();
        rc.setMute(true);
        
        //Using interface directly (creates constructor automaticly)
        RemoteControl Rc = new RemoteControl() {
           public void TurnOn(){};
           public void TurnOff(){};
           public void setVolume(int volume){}; 
        };

        //Multi interface constructor
        rc = new SmartTelevision();

        //Using Driver Constructor
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
