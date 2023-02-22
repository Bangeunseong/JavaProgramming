package Generic.GenericMethod.Inheritence;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
