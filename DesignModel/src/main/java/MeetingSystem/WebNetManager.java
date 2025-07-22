package MeetingSystem;

// Web网络管理
public class WebNetManager implements NetManager{
    @Override
    public void connect() {
        System.out.println("Web网络已连接");
    }
}
