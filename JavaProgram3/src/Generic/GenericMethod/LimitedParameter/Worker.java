package Generic.GenericMethod.LimitedParameter;

public class Worker extends Person {
    private String job;

    public Worker(String name, String job){super(name); this.job = job;}

    public String getJob(){return job;}
    public void setJob(String job){this.job = job;}
}
