package Exceptions;

public class NumberFormatException_1 {
    String data1 = "100";
    String data2 = "a100";
    public void method() throws NumberFormatException{
        int value1 = Integer.parseInt(data1, 0);
        int value2 = Integer.parseInt(data2, 0);

        int result = value1 + value2;
        System.out.println(result);
    }
}
