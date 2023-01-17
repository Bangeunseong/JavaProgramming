package NestedClass.Button;

public class AnonymousObject implements Button.OnClickListener{
    Button field = new Button(){
        int childfield = 3;
        void childMethod(){System.out.println("Child Method Executed!" + " " + childfield);};
        @Override
        public void touch(){childMethod(); listener.onClick();}
    };
    @Override
    public void onClick() {
        // TODO Auto-generated method stub
        System.out.println("Clicked Channel!");
    }
}
