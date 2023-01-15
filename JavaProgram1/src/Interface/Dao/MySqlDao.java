package Interface.Dao;

public class MySqlDao implements DataAccessObject{
    String name = "Mysql";

    //Method
    public void select(){System.out.println("Searching in " + name + " DB");}
    public void insert(){System.out.println("Inserting in " + name + " DB");}
    public void update(){System.out.println("Updating in "+ name + "DB");}
    public void delete(){System.out.println("Deleting in "+ name + "DB");}
}
