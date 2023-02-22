package NestedClass.Basic;

public class A {
    A(){System.out.println("Object A created");}

    //Instance member class
    class B{
        B(){System.out.println("Object B created");}
        int field1;
        void method1(){}
    }

    //Static member class
    static class C{
        C(){System.out.println("Object C created");}
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
    }

    void method(){
        //Local class
        class D{
            D(){System.out.println("Object D created");}
            int field1;
            void method1(){System.out.println(field1);}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
