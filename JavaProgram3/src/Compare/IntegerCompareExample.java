package Compare;

public class IntegerCompareExample {
    public static void main(String[] args){
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1.intValue()==obj2.intValue());
        System.out.println(obj3.intValue()==obj4.intValue());
    }
}
