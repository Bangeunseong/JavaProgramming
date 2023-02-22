package Generic.GenericMethod.Basic;

public class Box<T> {
    private T t;
    public T get(){return t;}
    public void set(T t){this.t = t;}
}