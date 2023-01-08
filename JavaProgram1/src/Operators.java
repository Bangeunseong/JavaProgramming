public class Operators {
    public static void main(String[] args){
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
    }
}
