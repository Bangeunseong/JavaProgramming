package StudentExample;
public class Student {
    private String studentNum;

    public Student(String studentNum){this.studentNum = studentNum;}

    public String getStudentNUM(){return studentNum;}

    @Override
    public int hashCode(){return Integer.parseInt(studentNum);}

    @Override
    public boolean equals(Object obj){
        if(obj.hashCode() == this.hashCode()) return true;
        return false;
    }
}
