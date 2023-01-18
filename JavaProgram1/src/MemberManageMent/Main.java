package MemberManageMent;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MemberList memberList = new MemberList();
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        while(run){
            System.out.print("1.SignUp | 2.Login > ");
            int operation = Integer.parseInt(scan.nextLine(), 0);
            switch(operation){
                case 1:
                memberList.SignUp(); break;
                case 2:
                System.out.print("ID: "); String ID = scan.nextLine();
                System.out.print("Password: "); String Password = scan.nextLine();
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
