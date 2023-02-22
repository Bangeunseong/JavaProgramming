package Lambda.Basic;

public class MyFunctionalInterface2Example {
    public static void main(String[] args){
        MyFunctionalInterface2 fi;
        fi = (x)->{int result = x * 5; System.out.println(result);};
        fi.method(5);
    }
}
