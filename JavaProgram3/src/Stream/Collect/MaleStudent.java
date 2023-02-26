package Stream.Collect;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
    //Field
    private List<Student> list;

    //Constructor
    public MaleStudent(){
        list = new ArrayList<Student>();
    }

    //Method
    public void accumulate(Student student){
        list.add(student);
    }
    public void combine(MaleStudent other){
        list.addAll(other.getList());
    }
    public List<Student> getList(){return list;}
}
