package Generic.GenericExample;

public class Container<T> {
    //Field
    private T key;

    //constructor
    public Container(){}
    public Container(T key){this.key = key;}

    //Method
    public void set(T key){this.key = key;}
    public T get(){return key;}
}
