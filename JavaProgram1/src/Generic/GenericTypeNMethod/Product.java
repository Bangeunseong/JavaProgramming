package Generic.GenericTypeNMethod;

public class Product<T,M> {
    private T kind;
    private M model;

    public T getkind(){return kind;}
    public M getmodel(){return model;}

    public void setkind(T kind){this.kind = kind;}
    public void setmodel(M model){this.model = model;}
}
