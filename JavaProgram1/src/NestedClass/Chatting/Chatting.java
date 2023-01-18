package NestedClass.Chatting;

public class Chatting {
    void startChat(String chatID){
        String nickname = chatID;
        Chat chat = new Chat(){
            @Override
            public void start(){
                while(true){
                    String inputData = "Hello";
                    String message = "[" + nickname + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
    class Chat{
        void start(){}
        void sendMessage(String message){System.out.println(message + "\nSent message to listener!");}
    }
}
