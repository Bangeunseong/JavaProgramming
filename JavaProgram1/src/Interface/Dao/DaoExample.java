package Interface.Dao;

public class DaoExample {
    public static void dbWorks(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    public static void main(String[] args){
        dbWorks(new OracleDao());
        dbWorks(new MySqlDao());
    }
}
