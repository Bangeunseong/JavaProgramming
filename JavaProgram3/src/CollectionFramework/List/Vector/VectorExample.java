package CollectionFramework.List.Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        List<Board> list = new Vector<Board>();

        list.add(new Board("Subject1", "Content1", "Writer1"));
        list.add(new Board("Subject2", "Content2", "Writer2"));
        list.add(new Board("Subject3", "Content3", "Writer3"));
        list.add(new Board("Subject4", "Content4", "Writer4"));
        list.add(new Board("Subject5", "Content5", "Writer5"));

        list.remove(2);
        list.remove(3);

        for(Board board : list){
            System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        }
    }
}
