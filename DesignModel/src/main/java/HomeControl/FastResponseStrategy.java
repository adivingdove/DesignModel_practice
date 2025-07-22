package HomeControl;

// 策略模式的具体实现类
public class FastResponseStrategy implements DeviceStrategy{
    @Override
    public void execute() {
        System.out.println("设备执行FastResponseStrategy：立即开机");
    }
}
