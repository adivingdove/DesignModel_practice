package HomeControl;

import java.util.ArrayList;
import java.util.List;

// 观察者模式中的具体实现类 —— 传感器
public class Sensor implements Subject{
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void registerSubscriber(Observer observer) {
        if(observer!=null && !subscribers.contains(observer)){
            subscribers.add(observer);
        }
    }

    @Override
    public void removeSubscriber(Observer observer) {
        if(observer != null && subscribers.contains(observer)){
            subscribers.remove(observer);
        }
    }

    @Override
    public void notifySubscriber(String message) {
        System.out.print("传感器："+ message);
        for(Observer obs : subscribers){
            obs.update(message);
        }
    }
}
