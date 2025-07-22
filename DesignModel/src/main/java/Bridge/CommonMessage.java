package Bridge;

public class CommonMessage extends Message{
    public CommonMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.send(message);
    }
}
