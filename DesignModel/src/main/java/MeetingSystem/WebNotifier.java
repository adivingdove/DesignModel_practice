package MeetingSystem;

// Web通知
public class WebNotifier implements Notifier{
    @Override
    public void sendNotification(String message) {
        System.out.println("[Web通知]" + message);
    }
}
