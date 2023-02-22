package Lambda.Basic;

public class MyFunctionalInterface3Example {
    public static void main(String[] args){
        MyFunctionalInterface3<Integer> fi1;
        fi1 = (x, y)->{int result = x + y; return result;};
        System.out.println(fi1.method(2, 5));

        MyFunctionalInterface3<Double> fi2;
        fi2 = (x, y)->{return sum(x, y);};
        System.out.println(fi2.method((double)3, 4.5));
    }
    public static <T extends Number> double sum(T x, T y){return x.doubleValue() + y.doubleValue();}
}
