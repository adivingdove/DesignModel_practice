package Mediator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SmartHomeMediator implements SmartMediator{
    private final Map<String, Device> devices = new ConcurrentHashMap<>();


    public void register(Device device){
        devices.put(device.getClass().getSimpleName(),device);
    }

    @Override
    public void notify(Device device, String event) {
        String deviceName = device.getClass().getSimpleName();
        switch (deviceName+":"+event){
            case "Alarm:Ringing" ->{
                System.out.println("中介者：开启灯光。");
                ((Light)devices.get("Light")).turnOn();
            }
            case "Light:On" ->{
                System.out.println("中介者：拉开窗帘。");
                ((Curtain)devices.get("Curtain")).withdraw();
            }
            case "Curtain:Open" ->{
                System.out.println("中介者：启动咖啡机");
                ((CoffeeMachine)devices.get("CoffeeMachine")).start();
            }
        }
    }
}
