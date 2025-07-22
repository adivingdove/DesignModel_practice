package MeetingSystem;


// 具体UI观察者
public class UIObserver implements Observer{
    @Override
    public void update(String status) {
        System.out.println("【UI模块】状态已更新："+status);
    }
}
