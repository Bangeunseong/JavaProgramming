package Generic.GenericTypeInherit;

public class StorageImp1<T> implements Storage<T> {
    //Field
    private T[] array;

    //Constructor
    public StorageImp1(int capacity){array = (T[])(new Object[capacity]);}

    //Method
    @Override
    public void add(T item, int index){array[index] = item;}
    @Override
    public T get(int index){return array[index];}
}
