package HomeControl;

// 策略模式的具体实现类
public class EnergySavingStrategy implements DeviceStrategy{
    @Override
    public void execute() {
        System.out.println("设备进入节能模式");
    }
}
