package MeetingSystem;

// 移动端通知
public class MobileNotifier implements Notifier{
    @Override
    public void sendNotification(String message) {
        System.out.println("[Moblie]"+message);
    }
}
