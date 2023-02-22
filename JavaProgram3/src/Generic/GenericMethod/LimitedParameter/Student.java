package Generic.GenericMethod.LimitedParameter;

public class Student extends Person {
    private int sno;

    public Student(String name, int sno){super(name); this.sno = sno;}

    public int getSno(){return sno;}
    public void setSno(int sno){this.sno = sno;}
}
