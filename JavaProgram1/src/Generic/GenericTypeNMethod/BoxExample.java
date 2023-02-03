package Generic.GenericTypeNMethod;

public class BoxExample {
    public static void main(String[] args){
        Box<Apple> box_Apple = new Box<Apple>();
        box_Apple.Set(new Apple());
        Apple apple = box_Apple.get();

        Box<String> box_String = new Box<String>();
        box_String.Set("Apple");
        String str = box_String.get();

        Box<Integer> box_Integer = new Box<Integer>();
        box_Integer.Set(6);
        int integer = box_Integer.get();
    }
}
