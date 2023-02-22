package BasicAPI.ObjectClass.GetProperty;

public class GetPropertyExample {
    public static void main(String[] args){
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("OS: " + osName);
        System.out.println("USER: " + userName);
        System.out.println("HOME: " + userHome);

        
    }
}
