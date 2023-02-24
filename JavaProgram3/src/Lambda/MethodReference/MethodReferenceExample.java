package Lambda.MethodReference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args){
        IntBinaryOperator operator;

        //Static Reference
        operator = (x,y)->Calculator.staticMethod(x, y);
        System.out.println("Result: " + operator.applyAsInt(1, 2));

        operator = Calculator::staticMethod;
        System.out.println("Result: " + operator.applyAsInt(2, 5));

        //Instance Reference
        Calculator calculator = new Calculator();
        operator = (x,y)->calculator.instanceMethod(x, y);
        System.out.println("Result: " + operator.applyAsInt(5, 10));
        
        operator = calculator::instanceMethod;
        System.out.println("Result: " + operator.applyAsInt(7, 10));
    }
}
