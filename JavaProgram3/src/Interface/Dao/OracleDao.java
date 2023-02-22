package Interface.Dao;

public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Searching data in OracleDB");        
    }

    @Override
    public void insert() {
        System.out.println("Insert data in OracleDB");        
    }

    @Override
    public void update() {
        System.out.println("Updating data in OracleDB");        
    }

    @Override
    public void delete() {
        System.out.println("Deleting data in OracleDB");
    }
}