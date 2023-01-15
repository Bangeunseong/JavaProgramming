package Inheritance.CellPhone;

public class CellPhoneExample {
    public static void main(String[] args){
        DmbCellPhone DmbCellPhone = new DmbCellPhone("Galaxy S8", "DeepBlue", 15);
        CellPhone CellPhone = new CellPhone("Galaxy S2", "Red");

        DmbCellPhone.PowerOn();
        DmbCellPhone.TurnOnDmb();
        DmbCellPhone.ChangeChannelDmb(15);
        DmbCellPhone.TurnOffDmb();
        DmbCellPhone.sendVoice("Fuck you!");
        DmbCellPhone.receiveVoice("Shut the fuck off!");
        DmbCellPhone.PowerOff();

        CellPhone.PowerOn();
    }
}
