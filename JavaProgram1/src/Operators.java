public class Operators {
    //Return BinaryString
    public static String toBinaryString(int val){
        String str = Integer.toBinaryString(val);
        while(str.length() < 32){
            str = "0" + str;
        }
        return str;
    }
    public static void main(String[] args){
        //Converting Data type
        byte byteval = 10;
        float floatval = 2.5F;
        double doubleval = 2.5;

        //when using operators you need to convert manually to get byte value even if valuetype is byte
        byte result1 = (byte)(byteval + byteval);

        int result2 = 5 + byteval;                  
        float result3 = 5 + floatval;
        double result4 = 5 + doubleval;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //Sign Operator +,-
        int f1 = +100;
        int f2 = -100;
        int result5 = f1;
        int result6 = -f1;
        int result7  = f1 - f2;

        System.out.println("result5 : " + result5);
        System.out.println("result6 : " + result6);
        System.out.println("result7 : " + result7);
        
        //Negative Logic Operator !
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        //Bit reverse Operator ~
        byte val1 = 10;
        int val2 = ~val1;   //Convert to int type
        int val3 = ~val1 + 1;

        System.out.println(toBinaryString(val1) + " (Decimal: " + val1 + ")");
        System.out.println(toBinaryString(val2) + " (Decimal: " + val2 + ")");
        System.out.println(toBinaryString(val3) + " (Decimal: " + val3 + ")");

        //Arithmatic Operator +,-,/,*,%
        byte byte1 = 1;
        byte byte2 = 1;
        byte byte3 = (byte)(byte1 + byte2); //Manual converting or using integer type
        int byte4 = byte1 + byte2;

        int int1 = 10, int2 = 4;
        int int3 = int1/int2;       //Accuracy Difference between integer and double
        double int4 = int1/int2;

        int v1 = 5, v2 = 2;

        int result_1 = v1 + v2;
        int result_2 = v1 - v2;
        int result_3 = v1 * v2;
        int result_4 = v1 / v2;
        int result_5 = v1 % v2;
        double result_6 = (double)v1 / v2;

        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println(result_5);
        System.out.println(result_6);

        //Char Operator
        char c1 = 'A' + 1;
        char c2 = 'A';
        char c3 = (char)(c2 + 1);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        //Overflow Detection
        int n1 = 2000000000, n2 = 2000000000;
        CheckOverflowExample(n1, n2);

        //Accuracy Testing
        
    }
    public static void CheckOverflowExample(int left, int right){
        try{
            int result = safeAdd(left, right);
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Overflow Detected! Cannot calculate Correctly!");
        }
    }
    public static int safeAdd(int left, int right){
        if(right > 0){
            if(left > Integer.MAX_VALUE - right){throw new ArithmeticException("Overflow Detected!");}
        }
        else{
            if(left < Integer.MIN_VALUE - right){throw new ArithmeticException("Overflow Detected!");}
        }
        return left + right;
    }
}
