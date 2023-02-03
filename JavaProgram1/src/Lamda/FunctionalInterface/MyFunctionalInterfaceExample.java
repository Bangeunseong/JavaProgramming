package Lamda.FunctionalInterface;

public class MyFunctionalInterfaceExample {
    public static int sum(int x, int y){return x+y;}
    public static void main(String[] args){
        MyFunctionalInterface fi;
        fi = x -> {
            int result = x*5;
            System.out.println(result);
        };
        fi.method(2);
        fi = (x)->{System.out.println(x*5);};
        fi.method(2);
        fi = x->System.out.println(x*5);
        fi.method(2);

        MyFunctionalInterface2 fi2;
        fi2 = (x, y) ->{return x + y;}; //fi2 = (x, y) -> x + y; -> same
        fi2 = (x,y) -> sum(x,y);
        System.out.println(fi2.method(2, 5));

        
    }
}
