package Day13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date msgData;

    public Message(User sender,User receiver,String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.msgData = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getMsgData() {
        return msgData;
    }

    public String toString() {
        return "FROM: '" + sender.getUserName() + "'\nTO: '" + receiver.getUserName() +
                "'\nON: " + msgData + "\n'" + text + "'";
    }
}
