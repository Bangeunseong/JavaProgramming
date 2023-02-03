package Generic.GenericExample;

public class MultiContainer<T,Y> extends Container<T> {
    //Field
    private Y value;

    //Constructor
    public MultiContainer(){}
    public MultiContainer(T key, Y value){super(key); this.value = value;}

    //Method
    public void set(T key, Y value){this.set(key); this.value = value;}
    public T getKey(){return this.get();}
    public Y getValue(){return value;}
}
