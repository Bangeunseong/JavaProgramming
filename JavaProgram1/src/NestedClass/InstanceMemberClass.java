package NestedClass;

public class InstanceMemberClass {
    InstanceMemberClass(){System.out.println("Created InstanceMemberClass");}

    int field;
    void method_Prime(){System.out.println("Executed Method_Prime");}

    static int field_s;
    static void method_Prime_S(){System.out.println("Executed Method_Prime_Static");}

    /* Instance member class */
    class InstanceMemberClassA{ //Should create InstanceMemberClass first to create InstanceMemberClassA
        InstanceMemberClassA(){System.out.println("Created InstanceMemberClassA");};  

        //Dynamic method and field
        int fieldA1;
        void methodA1(){
            System.out.println("Executed methodA1");

            //Dynamic field and method
            field = 3;
            method_Prime();

            //Static field and method
            field_s = 10;
            method_Prime_S();
        }
        //Static method and field -> error
        //static int fieldA2;
        //static void methodA2();
    }
    /* Static member class */
    static class InstanceMemberClassB{ //Can create Indivisual InstanceMemberClassB
        InstanceMemberClassB(){
            System.out.println("Created InstanceMemberClassB");
        }

        //Dynamic method and field
        int fieldB1;
        void methodB1(){
            System.out.println("Executed methodB1");

            //Dynamic field and method -> error
            //field = 5;
            //method_Prime();

            //Static field and method
            field_s = 5;
            method_Prime_S();
        }

        //Static method and field
        static int fieldB2 = 7;
        static void methodB2(){
            System.out.println("Executed methodB2");
        }
    }
    /* Local Class */
    void method(){
        class InstanceMemberClassC{
            InstanceMemberClassC(){System.out.println("Created InstanceMemberClassC");}

            //Dynamic method and field
            int fieldC1;
            void methodC1(){System.out.println("Executed methodC1");};

            //Static method and field -> error
            //static fieldC2;
            //static void methodC2(){};
        }

        //Used when making thread Object (비동기 처리할 때)
        InstanceMemberClassC C = new InstanceMemberClassC();
        C.fieldC1 = 3;
        System.out.println(C.fieldC1);
        C.methodC1();
    }
}
