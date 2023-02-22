package Generic.GenericMethod.LimitedParameter;

import java.util.ArrayList;
import java.util.List;

public class Course<T> {
    private String name;
    private List<T> students;

    public Course(String name){
        this.name = name;
        students = new ArrayList<T>();
    }

    public String getName(){return name;}
    public List<T> getStudents(){return students;}
    public void add(T t){students.add(t);}
}
