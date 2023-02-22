package StringClass;

public class StringCompare {
    public static void main(String[] args){
        String strVar1 = new String("shinmin");
        String strVar2 = "shinmin";
        System.out.println(strVar1.equals(strVar2));

        byte[] bytes1 = strVar1.getBytes();
        String strVar3 = new String(bytes1);
        
    }
}
