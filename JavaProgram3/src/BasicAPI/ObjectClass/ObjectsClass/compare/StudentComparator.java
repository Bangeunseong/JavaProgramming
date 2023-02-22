package BasicAPI.ObjectClass.ObjectsClass.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        if(a.getSno() < b.getSno()) return -1;
        else if(a.getSno() == b.getSno()) return 0;
        else return 1;
    }
}