package CollectionFramework.CollectionExample.HashSetExample;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name){
        this.studentNum = studentNum; this.name = name;
    }

    @Override
    public int hashCode(){return studentNum;}

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            if(obj.hashCode() == this.hashCode()) return true;
            else return false;
        }
        return false;
    }
}
