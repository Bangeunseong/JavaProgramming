package StudentExample;
import java.util.HashMap;

public class StudentExample {
    public static void main(String[] args) throws Exception {
        HashMap<Student,String> hashMap = new HashMap<Student,String>();

        hashMap.put(new Student("1"), "95");

        String score = hashMap.get(new Student("1"));
        System.out.println("First Student Total score : " + score);
    }
}
