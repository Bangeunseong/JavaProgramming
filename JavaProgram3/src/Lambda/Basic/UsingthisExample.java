package Lambda.Basic;

public class UsingthisExample {
    public static void main(String[] args){
        Usingthis usingThis = new Usingthis();
        Usingthis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
