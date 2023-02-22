package BasicAPI.ObjectClass.Cloning;

public class StudentExample {
    public static void main(String[] args){
        Student original = new Student("Honggildong", 25, new int[] {90,99}, new Car("Sonata"));

        Student cloned = original.getStudent();
        cloned.modifyScores(100, 0);
        cloned.modifyCar("Grandeur");

        System.out.println("[Cloned object field value]");
        System.out.println("name: " + cloned.getName());
        System.out.println("Age: " + cloned.getAge());

        System.out.print("Scores: {");
        int i = 0;
        for(int val : cloned.getScores()){
            System.out.print(val);
            System.out.print((i==cloned.getScores().length - 1) ? "":",");
            i++;
        }
        System.out.println("}");

        System.out.println("Car: " + cloned.getCar().model);
    }
}
