package BasicAPI.ObjectClass.SystemClass;

public class GarbageCollector {
    public static void main(String[] args){
        Employee emp;
        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = new Employee(3);

        System.out.println(emp.eno);
        System.gc();
    }
}

class Employee{
    public int eno;

    public Employee(int eno){this.eno = eno; System.out.println("Employee(" + eno + ") generated in memory");}

    public void finalize(){System.out.println("Employee(" + eno + ") deleted in memory");}
}