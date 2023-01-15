package Inheritance.CellPhone;

public class DmbCellPhone extends CellPhone {
    int Channel;

    //Constructor
    DmbCellPhone(String model, String color, int Channel){
        super(model, color); this.Channel = Channel;
    }

    //Method
    void TurnOnDmb(){System.out.println("Channel Number " + Channel +" receive starting");}
    void ChangeChannelDmb(int Channel){
        this.Channel = Channel;
        System.out.println("Changing channel to " + Channel);
    }
    void TurnOffDmb(){System.out.println("Stop receiving Dmb Broadcast");}
}
