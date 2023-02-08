package CollectionFramework.CollectionExample.ListExample;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    List<Board> list = new ArrayList<Board>();
    public synchronized List<Board> getBoardList(){
        list.add(new Board("Subject1", "Content1"));
        list.add(new Board("Subject2", "Content2"));
        list.add(new Board("Subject3", "Content3"));
        return list;
    }
}
