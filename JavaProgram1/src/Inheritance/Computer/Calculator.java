package Inheritance.Computer;

public class Calculator {
    public void PowerOn(){System.out.println("Calculator Power On!");}
    public void PowerOff(){System.out.println("Calculator Power Off!");}

    protected int add(int[] values){int sum = 0; for(int val : values) sum += val; return sum;}
    protected int sub(int[] values){int sum = 0; for(int val : values) sum -= val; return sum + values[0];}
    protected double divide(int[] values){double sum = values[0]; for(int i = 1; i < values.length; i++) sum /= values[i]; return sum;}
    protected int multiply(int[] values){int sum = 1; for(int val : values) sum *= val; return sum;}
    protected int GetArea(int width) {return width * width;}
    protected int GetArea(int width, int height){return width * height;}
    protected final double GetCircleArea(int radius){return 3.141592 * radius * radius;}
}
