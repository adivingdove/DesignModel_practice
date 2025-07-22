package MeetingSystem;

// 移动端组件工厂类，实现创建通知器、网络管理器、用户界面等方法
public class MobileComponentFactory implements ComponentFactory{
    @Override
    public Notifier createNotifier() {
        return new MobileNotifier();
    }

    @Override
    public NetManager createNetManager() {
        return new MobileNetManager();
    }

    @Override
    public UI createUI() {
        return new MobileUI();
    }
}
