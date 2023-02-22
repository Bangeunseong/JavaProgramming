package Generic.GenericMethod.Example;

public class UtilExample {
    public static void main(String[] args){
        Pair<String,Integer> pair = new Pair<String,Integer>("Honggildong", 35);
        Integer age = Util.getValue(pair, "Honggildong");
        System.out.println(age);

        ChildPair<String,Integer> childPair = new ChildPair<String,Integer>("Hongsamone", 20);
        Integer childAge = Util.getValue(childPair, "Hong");
        System.out.println(childAge);
    }
}
