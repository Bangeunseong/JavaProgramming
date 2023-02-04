package CollectionFramework.List;

public class Board {
    private String subject, content, writer;
    
    public Board(String subject, String content, String writer){
        this.subject = subject; this.content = content; this.writer = writer;
    }

    public String getSubject(){return subject;}
    public String getContent(){return content;}
    public String getWriter(){return writer;}
}

