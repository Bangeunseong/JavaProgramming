package NestedClass.Button;

public class Button {
    OnClickListener listener;
    void SetOnClickListener(OnClickListener listener){this.listener = listener;}
    void touch(){listener.onClick();}

    interface OnClickListener{  //Nested interface
        void onClick();
    }
}
