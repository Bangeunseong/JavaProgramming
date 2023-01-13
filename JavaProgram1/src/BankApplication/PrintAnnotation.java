package BankApplication;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface PrintAnnotation {
    String Value() default "-";
    int number() default 13;
}