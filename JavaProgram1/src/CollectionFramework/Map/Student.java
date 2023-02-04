package CollectionFramework.Map;

public class Student {
    private String name;
    private int sno;

    public Student(int sno, String name){this.sno = sno; this.name = name;}

    public int getsno(){return sno;}
    public String getName(){return name;}

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student)obj;
            return (sno == student.getsno()) & (name.equals(student.getName()));
        }
        return false;
    }

    @Override
    public int hashCode(){return name.hashCode() + sno;}
}
