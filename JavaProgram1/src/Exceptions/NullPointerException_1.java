package Exceptions;

public class NullPointerException_1 {
    public void Method1(String[] args) throws ArrayIndexOutOfBoundsException{
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }
    public void Method2() throws NullPointerException{
        String G = null;
        System.out.println(G.toString());
    }
}
