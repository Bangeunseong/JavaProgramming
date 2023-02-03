package Generic.GenericExample;

public class Util {
    public static <T extends Pair<?,?>, K> Object getValue(T pair , K key){
        if(pair.getKey().equals(key)) return pair.getValue();
        else return null;
    }
}
