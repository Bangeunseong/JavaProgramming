package BasicAPI.ObjectClass.SystemClass;

public class ProgramExit {
    public static void main(String[] args){
        System.setSecurityManager(new SecurityManager(){
            @Override
            public void checkExit(int status){if(status != 5){throw new SecurityException();}}
        });
        for(int i = 0;i < 10; i++){
            try{System.out.println(i); System.exit(i);}
            catch(SecurityException e){}
        }
    }
}