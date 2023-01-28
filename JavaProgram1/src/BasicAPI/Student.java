package BasicAPI;

import java.util.Objects;

public class Student {
    int sno;
    String name;
    //Constructor
    Student(){}
    Student(String name, int sno){this.name = name; this.sno = sno;}

    @Override
    public int hashCode(){
        return Objects.hash(name, sno);
    }
}
