package MeetingSystem;

// 桌面端网络管理器类
public class DesktopNetManager implements NetManager{
    @Override
    public void connect() {
        System.out.println("Desktop连接到网络");
    }
}
