package Basics;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args){
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for(Method method : declaredMethods){
            if(method.isAnnotationPresent(Annotation.class)){
                Annotation annotation = method.getAnnotation(Annotation.class);

                System.out.println("[" + method.getName() + "]");
                for(int i = 0; i < annotation.repeat(); i++){
                   System.out.print(annotation.value());
                }
                System.out.println();

                try{method.invoke(new Service());}
                catch(Exception e){System.out.println();}
            }
        }
    }
}
