public class VariableExample {
    public static void main(String[] args){
        int value = 10;         //Integer
        int result = value + 10;//Integer
        
        char c1 = 'A';          //Character
        char c2 = 65;           //Character with unicode
        char c3 = '\u0041';     //Character with 16bit
        char c4 = '가';         //Character(Available to use korean)
        char c5 = 44032;        //Character with unicode
        char c6 = '\uac00';     //Character with 16bit
        
        String str = "Welcome to Variable World";        //String type
        
        double pi = 3.14;       //Double
        double exponent1 = 3e6; //use e to express exponent 10->e^n
        double exponent2 = 2e-3;//

        float f_pi = 3.14F;     //Float use with F to convert double to F

        //Print Variables
        System.out.println(result);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        System.out.println(str);
        
        System.out.println("pi : " + pi);
        System.out.println("3e6 : " + exponent1);
        System.out.println("2e-3 : " + exponent2);

        System.out.println("float_pi : " + f_pi);


    }
}
