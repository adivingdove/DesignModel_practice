package MeetingSystem;

// 移动端网络管理器
public class MobileNetManager implements NetManager{
    @Override
    public void connect() {
        System.out.println("NetManager连接到网络");
    }
}
