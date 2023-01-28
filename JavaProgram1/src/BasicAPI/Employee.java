package BasicAPI;

public class Employee {
    public int eno;

    public Employee(int eno){this.eno = eno; System.out.println("Employee(" + eno +") is generated!");}
    public void finalize(){System.out.println("Employee(" + eno + ") is deleted!");}
}
