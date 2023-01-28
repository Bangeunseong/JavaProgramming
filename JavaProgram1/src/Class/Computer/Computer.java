package Class.Computer;
public class Computer {
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        int[] values_1 = {1,2,3};
        int result_1 = myCalculator.add(values_1);
        System.out.println("Summation = " + result_1);
    
        int result_2 = myCalculator.sub(new int[] {1,2,3,4,5});
        System.out.println("Subtract = " + result_2);

        double result_3 = myCalculator.divide(new int[]{1,2,3,4,5});
        System.out.println("Divide = " + result_3);

        int result_4 = myCalculator.multiply(values_1);
        System.out.println("Multiply = " + result_4);

        int result_5 = myCalculator.GetArea(10);
        int result_6 = myCalculator.GetArea(10, 5);
        System.out.println("P_Square = " + result_5 + "\nSquare = " + result_6);
        
        double result_7 = myCalculator.GetCircleArea(5);
        System.out.println("CircleArea = " + result_7);

        //About singleton -> Only single object can be made
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) System.out.println("Same Object!");
        else System.out.println("Different Object!");

        
    }
}
