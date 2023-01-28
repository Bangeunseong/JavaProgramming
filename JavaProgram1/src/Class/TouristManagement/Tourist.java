package Class.TouristManagement;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Tourist{
    protected String nation;
    protected String name;
    protected String ssn;

    @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
    public @interface Annotation{
        String nation() default "Unknown";
        String ssn()   default "Unknown";
        String name() default "Unknown";
    }

    @Annotation
    public Tourist(){nation = "Unknown"; ssn = "Unknown"; name = "Unknown";}
    public Tourist(String nation, String ssn, String name){
        this.nation = nation; this.ssn = ssn; this.name = name;
    }

    @Annotation
    public void InsertName(String name){this.name = new String(name);}
}