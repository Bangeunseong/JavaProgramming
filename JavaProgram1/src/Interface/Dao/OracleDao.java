package Interface.Dao;

public class OracleDao implements DataAccessObject {
    String name = "Oracle";

    //Method
    public void select(){System.out.println("Searching in " + name + " DB");}
    public void insert(){System.out.println("Inserting in " + name + " DB");}
    public void update(){System.out.println("Updating in "+ name + "DB");}
    public void delete(){System.out.println("Deleting in "+ name + "DB");}
}
