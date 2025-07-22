package MeetingSystem;

import java.util.ArrayList;
import java.util.List;

// 状态管理类，用于管理会议的状态变化，实现注册观察者，通知观察者，获取当前状态
public class MeetingStatusManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void setStatus(String status){
        this.status = status;
        System.out.println("状态变更，当前状态："+status);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer!=null && !observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer!=null && observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(status);
        }
    }
}
