package Generic.GenericMethod.Example;

public class Util {
    public static <K,V,T extends Pair<K,V>> V getValue(T p1, K key){
        if(p1.getKey() instanceof K){
            if(p1.getKey().equals(key)) return p1.getValue();
        }
        return null;
    } 
}
