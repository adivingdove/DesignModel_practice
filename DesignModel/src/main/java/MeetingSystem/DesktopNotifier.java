package MeetingSystem;

// 桌面端通知类
public class DesktopNotifier implements Notifier{
    @Override
    public void sendNotification(String message) {
        System.out.println("[Desktop]"+message);
    }
}
