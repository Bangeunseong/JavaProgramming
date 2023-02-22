package BasicAPI.ObjectClass.Cloning;

import java.util.Arrays;

public class Student implements Cloneable {
    private String name; private int age;
    private int[] scores; private Car car;

    public Student(String name, int age, int[] scores, Car car){
        this.name = name; this.age = age; this.scores = scores; this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student)super.clone();
        cloned.scores = Arrays.copyOf(scores, scores.length);
        cloned.car = new Car(this.car.model);
        return cloned;
    }

    public Student getStudent(){
        Student cloned = null;
        try{cloned = (Student)clone();}
        catch(CloneNotSupportedException e){e.printStackTrace();}
        return cloned;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public int[] getScores(){return scores;}
    public Car getCar(){return car;}
    public void modifyScores(int val, int index){scores[index] = val;}
    public void modifyCar(Object model){car.model = model.toString();}
}
