package NestedClass.Button;

public class MessageListener implements Button.OnClickListener {
    @Override
    public void onClick(){
        System.out.println("Sending message!");
    }
}
