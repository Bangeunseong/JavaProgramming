package StringClass;

import java.io.IOException;

public class KeyboardtoString {
    public static void main(String[] args) throws IOException{
        byte[] bytes = new byte[100];

        System.out.print("Input: ");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0, readByteNo - 2);
        System.out.println(str);
    }
}
