package Generic.GenericExample;

public class ContainerExample {
    public static void main(String[] args){
        Container<String> container1 = new Container<String>();
        container1.set("Honggildong!");
        String str = container1.get();
        System.out.println(str);

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
        System.out.println(value);

        MultiContainer<String, String> container3 = new MultiContainer<String, String>();
        container3.set("Honggildong", "Scavenger");
        String name = container3.getKey();
        String job = container3.getValue();

        MultiContainer<String,Integer> container4 = new MultiContainer<String,Integer>();
        container4.set("Honggildong", 35);
        name = container4.getKey();
        job = container4.getValue().toString();
    }
}
