package Generic.GenericMethod.Example;

public class ContainerVer2<K,V> extends Container<K> {
    private V value;

    public void setValue(V value){this.value = value;}
    public V getValue(){return value;}
}
