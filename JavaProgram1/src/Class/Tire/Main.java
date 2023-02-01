package Class.Tire;

public class Main {
    public static void main(String[] args){
        SnowTire snowTire = new SnowTire();
        Tire tire = null;
        snowTire.run();

        if(snowTire instanceof Tire){tire = snowTire; tire.run();}
    }
}
