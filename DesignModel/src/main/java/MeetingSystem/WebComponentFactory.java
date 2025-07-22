package MeetingSystem;


// Web工厂：创建 Web 平台的 UI / 通知器
public class WebComponentFactory implements ComponentFactory{
    @Override
    public Notifier createNotifier() {
        return new WebNotifier();
    }

    @Override
    public NetManager createNetManager() {
        return new WebNetManager();
    }

    @Override
    public UI createUI() {
        return new WebUI();
    }
}
