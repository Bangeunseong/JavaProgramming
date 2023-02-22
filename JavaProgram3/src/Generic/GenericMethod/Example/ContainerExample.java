package Generic.GenericMethod.Example;

public class ContainerExample {
    public static void main(String[] args){
        Container<String> container1 = new Container<String>();
        container1.setKey("Honggildong");
        String str = container1.getKey();

        Container<Integer> container2 = new Container<Integer>();
        container2.setKey(1);
        Integer val = container2.getKey();

        ContainerVer2<String,String> container3 = new ContainerVer2<String,String>();
        container3.setKey("Honggildong"); container3.setValue("Thief");
        String name1 = container3.getKey(); String job1 = container3.getValue();
    }
}
