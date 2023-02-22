package Generic.GenericMethod.Basic;

public class CompareMethodExample {
    public static void main(String[] args){
        Pair<Integer,String> p1 = new Pair<Integer,String>(1, "Apple");
        Pair<Integer,String> p2 = new Pair<Integer,String>(1, "Apple");
        boolean result1 = UtilB.<Integer,String>compare(p1, p2);
        if(result1){System.out.println("Logically equal");}
        else{System.out.println("Logically unequal");}

        Pair<String,String> p3 = new Pair<String,String>("user1", "Honggildong");
        Pair<String,String> p4 = new Pair<String,String>("user2", "Honggildong");
        boolean result2 = UtilB.<String,String>compare(p3, p4);
        if(result2){System.out.println("Logically equal");}
        else{System.out.println("Logically unequal");}
    }
}
