package MemberManageMent;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MemberList memberList = new MemberList();
        Scanner scan = new Scanner(System.in);

        boolean run = true; String ID, Password;
        while(run){
            System.out.print("1.SignUp | 2.Login > ");
            int operation = scan.nextInt(); scan.nextLine();
            switch(operation){
                case 1:
                System.out.print("ID: "); ID = scan.nextLine();
                System.out.print("Password: "); Password = scan.nextLine();
                memberList.SignUp(ID, Password);
                break;
                case 2:
                System.out.print("ID: "); ID = scan.nextLine();
                System.out.print("Password: "); Password = scan.nextLine();
                try{
                    memberList.Login(ID, Password);
                }
                catch(NotExistIDException e){System.out.println(e.getMessage());}
                catch(WrongPasswordException e){System.out.println(e.getMessage());}
                finally{run = false;}
                break;
                default: break;
            }
        }
        scan.close();
    }
}
