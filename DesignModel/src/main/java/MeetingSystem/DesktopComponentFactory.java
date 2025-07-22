package MeetingSystem;

// 桌面组件工厂类，用于创建桌面通知器、网络管理器以及用户界面
public class DesktopComponentFactory implements ComponentFactory{
    @Override
    public Notifier createNotifier() {
        return new DesktopNotifier();
    }

    @Override
    public NetManager createNetManager() {
        return new DesktopNetManager();
    }

    @Override
    public UI createUI() {
        return new DesktopUI();
    }
}
