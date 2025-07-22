package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        if(observer!= null && !observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(float temp, float humidity, float pressure) {
        System.out.println("天气数据已更新： 温度="+temp+ "，湿度="+humidity+"，气压="+pressure);
        for(Observer obs : observers){
            if(obs!=null){
                try{
                    obs.update(temp,humidity,pressure);
                }catch(Exception e){
                    System.out.println("天气信息更新失败："+e.getMessage());
                }
            }
        }
    }
}
