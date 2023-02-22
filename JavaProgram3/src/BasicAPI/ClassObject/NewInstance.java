package BasicAPI.ClassObject;

public class NewInstance {
    public static void main(String[] args){
        try{
            Class clazz = Class.forName("BasicAPI.ClassObject.SendAction");
            //Class clazz = Class.forName("BasicAPI.ClassObject.ReceiveAction");
            Action action = (Action)clazz.newInstance();
            action.execute();
        }
        catch(ClassNotFoundException e){e.printStackTrace();}
        catch(InstantiationException e){e.printStackTrace();}
        catch(IllegalAccessException e){e.printStackTrace();}
    }
}
