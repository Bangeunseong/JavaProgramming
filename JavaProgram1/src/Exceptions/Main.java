package Exceptions;

public class Main {
    public static void main(String[] args){
        //NullPointerException and ArrayIndexOutOfBoundsException
        NullPointerException_1 A = new NullPointerException_1();
        try{
            A.Method1(args);
            A.Method2();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException!");
        }
        catch(NullPointerException e){
          System.out.println("Null pointer exception!");  
        }
        finally{
            System.out.println("Code needs to be changed!");
        }

        //Number format exception
        NumberFormatException_1 B = new NumberFormatException_1();
        try{B.method();}
        catch(Exception e){System.out.println("Number format exception!");}

        //Class cast exception
        Animal animal = new Dog("Mammal", "Lynx");
        if(animal instanceof Dog){Dog dog = (Dog)animal; dog.getInfo();}
        if(animal instanceof Cat){Cat cat = (Cat)animal; cat.getInfo();}
        
        //Custom Exception
        Account account = new Account();

        account.deposit(100000);
        System.out.println("Balance: " + account.getBalance());

        try{
            account.withdraw(300000);
        }
        catch(BalanceInsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
