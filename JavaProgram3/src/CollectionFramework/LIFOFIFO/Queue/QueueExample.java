package CollectionFramework.LIFOFIFO.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail", "Honggildong"));
        messageQueue.offer(new Message("sendSMS", "Shinjyeongwu"));
        messageQueue.offer(new Message("sendKakaoTalk", "Hongmanduk"));

        while(!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch(message.command){
                case "sendMail":
                System.out.println("Sending mail to " + message.to); break;
                case "sendSMS":
                System.out.println("Sending SMS to " + message.to); break;
                case "sendKakaoTalk":
                System.out.println("Sending kakaotalk to " + message.to); break;
            }
        }
    }
}
