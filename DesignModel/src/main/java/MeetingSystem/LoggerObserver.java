package MeetingSystem;

// 日志观察者类
public class LoggerObserver implements Observer{
    @Override
    public void update(String status) {
        System.out.println("日志已更新，记录状态："+status);
    }
}
