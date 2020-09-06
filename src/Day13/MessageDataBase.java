package Day13;

import java.util.LinkedList;
import java.util.List;

public class MessageDataBase {

    private static List<Message> messages = new LinkedList<>();

    public static void sendMessage (User u1, User u2, String text) {
        messages.add(new Message(u1,u2,text));
    }

    public static  void showDialog(User u1, User u2) {

        for (Message message:messages) {
            if ((message.getSender().equals(u1)||message.getSender().equals(u2)) &&
                    (message.getReceiver().equals(u1)|| message.getReceiver().equals(u2))) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
