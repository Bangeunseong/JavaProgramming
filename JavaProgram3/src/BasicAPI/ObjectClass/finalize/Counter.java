package BasicAPI.ObjectClass.finalize;

public class Counter {
    private int no;

    public Counter(int no){this.no = no;}

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object number " + no + " finalize() executed!");
    }
}
