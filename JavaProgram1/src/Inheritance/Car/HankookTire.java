package Inheritance.Car;

public class HankookTire extends Tire {
    private final String name = "HankookTire";

    public HankookTire(String Location, int maxRotation){
        super(Location, maxRotation);
    }

    @Override
    public boolean roll(){
        if(maxRotation > ++accumulateRotation){
            System.out.println(location + " " + name + " Life span: " + (maxRotation - accumulateRotation) + "times");
            return true;
        }
        else{
            System.out.println("*** " + location + " " + name + " punctured ***");
            return false;
        }
    }

    @Override
    public String getTireName(){return name;}
}