package Generic.WildCardType;

import java.util.Arrays;

public class WildCardExample {
    public static void registerCourse(Course<?> course){
        System.out.println(course.getName() + " ClassStudents: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course){
        System.out.println(course.getName() + " ClassStudents: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course){
        System.out.println(course.getName() + " ClassStudents: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args){
        Course<Person> personCourse = new Course<Person>("PersonCourse", 5);
        personCourse.add(new Person("Harry", "1234511"));
        personCourse.add(new Worker(new Person("Gary", "145112262"), 45));
        personCourse.add(new Student(new Person("James", "5141242"), 17121215));
        personCourse.add(new HighStudent(new Student(new Person("Riley", "41124151"), 19012123), true));

        Course<Worker> workerCourse = new Course<Worker>("WorkerCourse", 5);
        workerCourse.add(new Worker(new Person("Kile", "71889123"), 50));

        Course<Student> studentCourse = new Course<Student>("StudentCourse", 5);
        studentCourse.add(new Student(new Person("Lily", "4112312"), 15881293));
        studentCourse.add(new HighStudent(new Student(new Person("Elison", "71828131"), 16121313), false));

        Course<HighStudent> highstudentCourse = new Course<HighStudent>("HighStudentCourse", 5);
        highstudentCourse.add(new HighStudent("Alison", "41431251", 11231311, true));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highstudentCourse);
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
        System.out.println();

        registerCourseStudent(studentCourse);
        registerCourseStudent(highstudentCourse);
        System.out.println();
    }
}
