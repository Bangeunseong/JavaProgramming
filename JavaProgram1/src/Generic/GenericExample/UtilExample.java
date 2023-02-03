package Generic.GenericExample;

public class UtilExample {
    public static void main(String[] args){
        Pair<String,Integer> pair = new Pair<String,Integer>("Honggildong", 35);
        Integer age = (Integer)Util.getValue(pair, "Honggildong");
        System.out.println(age);

        ChildPair<String,Integer> childPair = new ChildPair<String,Integer>("Hongsamwon", 20);
        Integer childAge = (Integer)Util.getValue(childPair, "Hongsamsoon");
        System.out.println(childAge);

        //Not possible to use otherpair in util.getvalue()
        /*OtherPair<String,Integer> otherPair = new OtherPair<String,Integer>("Hongsamwon", 20);
        int otherAge = Util.getValue(otherPair, "Hongsamwon");
        System.out.println(otherAge);*/
    }
}
