package CollectionFramework.Example;

public class Student {
    public int studentNo;
    public String name;

    public Student(int studentNo, String name){
        this.studentNo = studentNo; this.name = name;
    }

    @Override
    public int hashCode(){return studentNo;}

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student)obj;
            if(student.hashCode() == this.hashCode()) return true;
        }
        return false;
    }
}
