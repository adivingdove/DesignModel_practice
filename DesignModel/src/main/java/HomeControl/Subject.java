package HomeControl;

// 观察者模式中的主题接口
public interface Subject {
    // 注册订阅者
    void registerSubscriber(Observer obs);

    // 注销订阅者
    void removeSubscriber(Observer obs);

    // 通知订阅者
    void notifySubscriber(String message);
}
