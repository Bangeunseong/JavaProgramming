package MemberManageMent;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MemberList memberList = new MemberList();
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        while(run){
            System.out.print("Command> ");
            String operation = scan.nextLine();
            
            if(operation.equals("SignUp")) memberList.SignUp();
            else if(operation.equals("Login")) {
                String ID = scan.nextLine();
                String Password = scan.nextLine();
                try{
                    memberList.Login(ID, Password);
                }
                catch(NotExistIDException e){
                    System.out.println(e.getMessage());
                }
                catch(WrongPasswordException e){
                    System.out.println(e.getMessage());
                }
                finally{run = false;}
            }
        }
        scan.close();
    }
}
