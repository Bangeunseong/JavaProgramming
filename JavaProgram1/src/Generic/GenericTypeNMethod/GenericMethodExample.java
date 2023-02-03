package Generic.GenericTypeNMethod;

public class GenericMethodExample {
    public static void main(String[] args){
        Box<Integer> box1 = GenericMethod.<Integer>boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = GenericMethod.<String>boxing("HongGilDong");
        String strValue = box2.get();
        System.out.println(strValue);

        Pair<Integer,String> p1 = new Pair<Integer,String>(1, "Apple");
        Pair<Integer,String> p2 = new Pair<Integer,String>(1, "Apple");
        boolean result1 = GenericMethod.<Integer,String>compare(p1, p2);
        if(result1){System.out.println("Logically equal!");}
        else{System.out.println("Logically not equal!");}

        Pair<String,String> p3 = new Pair<String,String>("User1", "HongGilDong");
        Pair<String,String> p4 = new Pair<String,String>("User2", "HongGilDong");
        boolean result2 = GenericMethod.compare(p3, p4);
        if(result2){System.out.println("Logically equal!");}
        else{System.out.println("Logically not equal!");}
    }
}
