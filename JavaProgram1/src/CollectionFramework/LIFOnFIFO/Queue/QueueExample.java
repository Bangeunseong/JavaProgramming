package CollectionFramework.LIFOnFIFO.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
        Queue<Message> queue = new LinkedList<Message>();

        queue.offer(new Message("sendMail", "Honggildong"));
        queue.offer(new Message("sendSMS", "Shinhandong"));
        queue.offer(new Message("sendKakaotalk", "Gary goldman"));

        while(!queue.isEmpty()){
            Message message = queue.poll();
            switch(message.command){
                case "sendMail":
                System.out.println("Sending mail to " + message.to); break;
                case "sendSMS":
                System.out.println("Sending SMS to " + message.to); break;
                case "sendKakaotalk":
                System.out.println("Sending kakaotalk to " + message.to); break;
            }
        }
    }
}