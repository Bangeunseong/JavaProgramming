package Generic.GenericMethod.LimitedParameter;

public class HighStudent extends Student {
    private boolean access;

    public HighStudent(String name, int sno, boolean access){
        super(name, sno); this.access = access;
    }

    public void setAccess(boolean access){this.access = access;}
    public boolean getAccess(){return access;}
}
