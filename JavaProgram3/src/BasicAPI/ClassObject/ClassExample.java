package BasicAPI.ClassObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
    public static void main(String[] args){
        try{
            Class clazz2 = Class.forName("NestedClass.Example.Car");
            System.out.println("[Class Name]");
            System.out.println(clazz2.getName());
            System.out.println();
            
            System.out.println("[Constructor Info]");
            Constructor[] constructors = clazz2.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                System.out.print(constructor.getName() +"(");
                Class[] parameters = constructor.getParameterTypes();
                for(Class parameter : parameters){System.out.print(parameter);}
                System.out.println(")");
            }
            System.out.println();

            System.out.println("[Field Info]");
            Field[] fields = clazz2.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field.getType().getSimpleName() + " " + field.getName());
            }
            System.out.println();

            System.out.println("[Method Info]");
            Method[] methods = clazz2.getDeclaredMethods();
            for(Method method : methods){
                System.out.print(method.getName() + "(");
                Class[] parameters = method.getParameterTypes();
                for(Class parameter : parameters){System.out.print(parameter);}
                System.out.println(")");
            }

        }
        catch(ClassNotFoundException e){e.printStackTrace();}
    }
}
