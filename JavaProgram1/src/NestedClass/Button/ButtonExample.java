package NestedClass.Button;

public class ButtonExample {
    public static void main(String[] args){
        Button btn = new Button();
        AnonymousObject ano = new AnonymousObject();

        ano.field.SetOnClickListener(ano);
        ano.field.touch();
        
        btn.SetOnClickListener(new CallListener());
        btn.touch();

        btn.SetOnClickListener(new MessageListener());
        btn.touch();
    }
}
