package Interface.RemoteControl;

public class SmartTelevision extends Television implements Searchable {
    public void search(String url){System.out.println("Searching " + url);}
}
