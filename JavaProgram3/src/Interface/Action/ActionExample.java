package Interface.Action;

public class ActionExample {
    public static void main(String[] args){
        Action action = new Action() {
            @Override
            public void work(){
                System.out.println("Copying!");
            }
        };

        action.work();
    }
}
