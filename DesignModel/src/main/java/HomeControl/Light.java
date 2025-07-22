package HomeControl;

// 具体设备类
public class Light extends Device{
    public Light(String name) {
        super(name);
        setState(new OffState());
    }

    @Override
    public void on() {
        System.out.println("开灯");
        setState(new OnState());
    }

    @Override
    public void off() {
        System.out.println("关灯");
        setState(new OffState());
    }
}
