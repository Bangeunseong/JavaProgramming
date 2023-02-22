package Interface.Dao;

public class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Searching data in MySqlDao");        
    }

    @Override
    public void insert() {
        System.out.println("Inserting data in MySqlDao");        
    }

    @Override
    public void update() {
        System.out.println("Updating data in MySqlDao");        
    }

    @Override
    public void delete() {
        System.out.println("Deleting data in MySqlDao");        
    }
}
