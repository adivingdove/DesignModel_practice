package HomeControl;

// 状态模式具体实现类
public class OffState implements DeviceState{
    @Override
    public void handle(Device device) {
        System.out.println(device.getClass().getSimpleName()+"已关闭");
        device.setState(this);
    }
}
