package HomeControl;

// 具体设备类
public class Curtain extends Device{

    public Curtain(String name) {
        super(name);
        setState(new OffState());
    }

    @Override
    public void on() {
        System.out.println("打开窗帘");
        setState(new OnState());
    }

    @Override
    public void off() {
        System.out.println("关闭窗帘");
        setState(new OffState());
    }
}
