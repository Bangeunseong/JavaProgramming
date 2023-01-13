package Computer;
public class Calculator {
    static double pi = 3.141592;
    public void PowerOn(){System.out.println("Power On!");}
    public int add(int[] values){int sum = 0; for(int val : values) sum += val; return sum;}
    public int sub(int[] values){int sum = 0; for(int val : values) sum -= val; return sum + values[0];}
    public double divide(int[] values){double sum = values[0]; for(int i = 1; i < values.length; i++) sum /= values[i]; return sum;}
    public int multiply(int[] values){int sum = 1; for(int val : values) sum *= val; return sum;}
    public int GetArea(int width) {return width * width;}
    public int GetArea(int width, int height){return width * height;}
    public double GetCircleArea(int radius){return pi * radius * radius;}
    public void PowerOff(){System.out.println("Power Off!");}
}
