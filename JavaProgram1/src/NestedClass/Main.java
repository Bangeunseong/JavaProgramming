package NestedClass;

public class Main {
    public static void main(String[] args){
        //Main class A
        InstanceMemberClass A = new InstanceMemberClass();

        //Instance member class B
        InstanceMemberClass.InstanceMemberClassA B = A.new InstanceMemberClassA();
        B.fieldA1 = 5;
        B.methodA1();

        //Static member class C
        InstanceMemberClass.InstanceMemberClassB C = new InstanceMemberClass.InstanceMemberClassB();
        C.fieldB1 = 3;
        C.methodB1();
        InstanceMemberClass.InstanceMemberClassB.fieldB2 = 3;
        InstanceMemberClass.InstanceMemberClassB.methodB2();

        //Local Class
        A.method();
    }
}