package Generic.GenericMethod.Basic;

public class BoxingExample {
    public static void main(String[] args){
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int value1 = box1.get();

        Box<String> box2 = Util.<String>boxing("Honggildong");
        String value2 = box2.get();
    }
}
