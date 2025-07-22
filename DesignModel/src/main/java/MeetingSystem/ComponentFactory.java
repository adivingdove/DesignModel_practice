package MeetingSystem;

// 抽象工厂接口
public interface ComponentFactory {
    Notifier createNotifier();
    NetManager createNetManager();
    UI createUI();
}
