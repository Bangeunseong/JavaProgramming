package NestedClass.Button;

public class ButtonExample {
    public static void main(String[] args){
        Button btn = new Button();
        //AnonymousObject ano = new AnonymousObject();

        //ano.field.touch();
        //ano.field.SetOnClickListener(ano);

        btn.SetOnClickListener(new CallListener());
        btn.touch();

        btn.SetOnClickListener(new MessageListener());
        btn.touch();
    }
}
