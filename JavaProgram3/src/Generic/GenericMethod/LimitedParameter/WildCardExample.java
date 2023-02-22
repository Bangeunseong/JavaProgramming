package Generic.GenericMethod.LimitedParameter;

import java.util.Iterator;

public class WildCardExample {
    public static void registerCourse(Course<?> course){
        Iterator<?> iterator = course.getStudents().iterator();
        System.out.print(course.getName() + " Students: [");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString());
            if(iterator.hasNext()) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void registerCourseStudent(Course<? extends Student> course){
        Iterator<?> iterator = course.getStudents().iterator();
        System.out.print(course.getName() + " Students: [");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString());
            if(iterator.hasNext()) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void registerCourseWorker(Course<? super Worker> course){
        Iterator<?> iterator = course.getStudents().iterator();
        System.out.print(course.getName() + " Students: [");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString());
            if(iterator.hasNext()) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        Course<Person> personCourse = new Course<Person>("NormalCourse");
        personCourse.add(new Person("Honggildong"));
        personCourse.add(new Worker("James", "Mathmatician"));
        personCourse.add(new Student("Gregory", 18123131));
        personCourse.add(new HighStudent("Jerry", 18231231, true));

        Course<Worker> workerCourse = new Course<Worker>("WorkerCourse");
        workerCourse.add(new Worker("Kary", "Teacher"));

        Course<Student> studentCourse = new Course<Student>("StudentCourse");
        studentCourse.add(new Student("Elon", 14112511));
        studentCourse.add(new HighStudent("Tyron", 18131232, true));

        Course<HighStudent> highstudentCourse = new Course<HighStudent>("HighStudentCourse");
        highstudentCourse.add(new HighStudent("Frank", 16141241, true));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highstudentCourse);
    }
}
