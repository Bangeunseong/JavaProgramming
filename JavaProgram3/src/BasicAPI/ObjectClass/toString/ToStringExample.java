package BasicAPI.ObjectClass.toString;

import java.util.Date;

public class ToStringExample {
    public static void main(String[] args){
        Object obj1 = new Object();
        Date obj2 = new Date();
        SmartPhone obj3 = new SmartPhone("Google", "Android");
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString()); //same as System.out.println(obj3);
    }
}
