package Lambda.Basic;

public class MyFunctionalInterface1Example {
    public static void main(String[] args){
        MyFunctionalInterface1 fi;
        fi = ()->{String str = "method call"; System.out.println(str);};
        fi.method();

        fi = ()->System.out.println("method call");
        fi.method();
    }
}
