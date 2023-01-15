package Inheritance.Computer;

public class Computer extends Calculator{
    String User;
    String Password;

    Computer(String User, String Password){this.User = User; this.Password = Password;}

    public void PowerOn(){System.out.println("Computer Power On!"); super.PowerOn();}
    public void PowerOff(){super.PowerOff(); System.out.println("ComputerPower Off!");}

    //@Override
    //public double GetCircleArea(int radius){return Math.PI * radius * radius;}  //impossible to override cause its final method
}
