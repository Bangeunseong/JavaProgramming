package Lambda.Basic;

@FunctionalInterface
public interface MyFunctionalInterface3<T extends Number> {
    public T method(T x, T y);
}
