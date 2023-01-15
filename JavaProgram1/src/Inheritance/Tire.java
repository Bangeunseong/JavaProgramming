package Inheritance;

public abstract class Tire {
    public int maxRotation;
    public int accumulateRotation;
    public String location;

    public Tire(String location, int maxRotation){this.location = location; this.maxRotation = maxRotation;}

    public abstract boolean roll();
    public abstract String getTireName();
}
