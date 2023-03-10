package Basics;
public class Operators {

    //Return BinaryString
    public static String toBinaryString(int val){
        String str = Integer.toBinaryString(val);
        while(str.length() < 32){
            str = "0" + str;
        }
        return str;
    }

    //Overflow Exception function
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

    //NaN and Infinity Exception function
    public static void CheckNaNInfinityExample(double left, double right){
        try{
            double result_1 = safeDevide(left, right);
            double result_2 = safeRemainder(left, right);
            System.out.println(result_1);
            System.out.println(result_2);
        }
        catch(ArithmeticException e){
            System.out.println("NaN or Infinity Detected!");
        }
    }
    public static double safeDevide(double left, double right){
        double z = left / right;
        if(Double.isInfinite(z)){throw new ArithmeticException("Infinity Detected!");}
        return z;
    }
    public static double safeRemainder(double left, double right){
        double z = left % right;
        if(Double.isNaN(z)){throw new ArithmeticException("NaN Detected!");}
        return z;
    }
    //Main
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
        int apple = 1;
        double pieceunit = 0.1;
        int number = 7;
        
        double pieces = apple - pieceunit*number;   //Not Accurate because of the two exponent calculation (2??? ??????)
        System.out.println(pieces);
        
        int totalpieces = apple * 10;
        double A_pieces = (totalpieces - number)/10.0;
        System.out.println(A_pieces);

        //NaN and Infinity Calculation --- will cause problem
        int x = 5; int y = 0;
        CheckNaNInfinityExample(x, y);

        //Converting userinput and NaN or Infinity Check
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0 + val;
        CheckNaNInfinityExample(currentBalance, 1);

        //String Connecting Operator
        String str1 = "JDK" + 6.0;
        String str2 = str1 + " ??????";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0;
        String str4 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);

        //Compare Operator
        int num1 = 10, num2 = 10;
        boolean b_result_1 = (num1 == num2);
        boolean b_result_2 = (num1 != num2);
        boolean b_result_3 = (num1 <= num2);

        char char1 = 'A', char2 = 'B';
        boolean b_result_4 = (char1 < char2);

        System.out.println(b_result_1);
        System.out.println(b_result_2);
        System.out.println(b_result_3);
        System.out.println(b_result_4);

        int v_2 = 1;
        double v_3 = 1.0;
        System.out.println(v_2 == v_3);

        double v_4 = 0.1;
        float v_5 = 0.1f;
        System.out.println(v_4 == v_5);

        //When comparing string type
        String strVar1 = "?????????";
        String strVar2 = "?????????";
        String strVar3 = new String("?????????");  //new String Structure declare different between strVar2

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar2 == strVar3);
        System.out.println(strVar2.equals(strVar3));

        //Bit Operator
        byte b1 = 45; byte b2 = 25;
        System.out.println("b1 & b2 = " + (b1 & b2));

        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));

        //Bit Shift Operator
        int b_shift1 = 1 << 3;
        int b_shift2 = -8 >> 3;
        int b_shift3 = -8 >>> 3;
        System.out.println("1 << 3 = " + b_shift1 + "\n-8 >> 3 = " + b_shift2 + "\n-8 >>> 3 = " + b_shift3);

        //Multi Calculation Operator
        int A_result = 10;

        A_result += 5;  // same as A_result = A_result + 5
        A_result -= 3;  // same as A_result = A_result - 3
        A_result *= 5;  // same as A_result = A_result * 5
        A_result /= 2;  // same as A_result = A_result / 2
        A_result %= 3;  // same as A_result = A_result % 3

        byte B_result = 45;

        B_result >>= 4; // same as B_result = B_result >> 4
        B_result <<= 3; // same as B_result = B_result << 3
        B_result >>>= 5;// same as B_result = B_result >>> 5
        B_result &= 45; // same as B_result = B_result & 45
        B_result |= 45; // same as B_result = B_result | 45
        B_result ^= 45; // same as B_result = B_result ^ 45

        System.out.println("A_result = " + A_result + "\nB_result = " + B_result);

        //Triple Calculation Operator
        int score = 90;
        System.out.println(score > 75 ? 'A' : 'B');
    }

}
