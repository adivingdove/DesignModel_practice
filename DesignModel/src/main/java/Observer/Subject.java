package Observer;

public interface Subject {
    // 注册方法
    void registerObserver(Observer observer);

    // 注销方法
    void removeObserver(Observer observer);

    // 通知方法
    void notifyObservers(float temp, float humidity, float pressure);
}
