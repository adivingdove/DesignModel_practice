package MeetingSystem;

// 远程服务观察者，Observer的具体类
public class RemoteServiceObserver implements Observer{

    @Override
    public void update(String status) {
        System.out.println("【远程服务】 收到状态："+status);
    }
}
