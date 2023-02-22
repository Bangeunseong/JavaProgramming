package NestedClass.Anonymous;

public class Anonymous {
    Person field = new Person(){
        void work(){System.out.println("Go to work");}
        @Override
        void wake(){System.out.println("Wake up at 6am"); work();}
    };

    void method1(){
        Person localVar = new Person(){
            void walk(){System.out.println("Take a walk");}
            @Override
            void wake(){System.out.println("Wake up at 7am"); walk();}
        };
        localVar.wake();
    }

    void method2(Person person){
        person.wake();
    }
}
