package CollectionFramework.Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args){
        Map<String,String> map = new Hashtable<String, String>();

        map.put("Spring", "12");
        map.put("Summer", "1234");
        map.put("Fall", "123456");
        map.put("Winter", "12345678");

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter ID and Password");
            System.out.print("ID: ");
            String id = scan.nextLine();

            System.out.print("Password: ");
            String password = scan.nextLine();

            if(map.containsKey(id)){
                if(map.get(id).equals(password)){System.out.println("Login Success!"); break;}
                else {System.out.println("Wrong Password!");}
            }
            else{System.out.println("ID doesn't exist!");}
        }

        scan.close();
    }
}
