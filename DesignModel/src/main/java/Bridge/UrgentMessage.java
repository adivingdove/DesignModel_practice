package Bridge;

public class UrgentMessage extends Message{
    public UrgentMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.send("【紧急】"+ message);
    }
}
