package Bridge;

public class EmailSender implements MessageSender{
    @Override
    public void send(String message) {
        System.out.println(" [Email] " + message);
    }
}
