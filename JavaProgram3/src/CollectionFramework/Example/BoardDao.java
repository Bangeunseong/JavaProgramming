package CollectionFramework.Example;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> list = new ArrayList<Board>();

    public BoardDao(){
        list.add(new Board("Subject1", "Content1"));
        list.add(new Board("Subject2", "Content2"));
        list.add(new Board("Subject3", "Content3"));
    }

    public List<Board> getBoardList(){return list;}
}
