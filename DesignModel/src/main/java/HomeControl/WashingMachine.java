package HomeControl;

// 具体设备类，模板方法模式
public class WashingMachine extends SmartDevice{
    @Override
    void checkUp() {
        System.out.print("洗衣机开始检测 -> ");
    }

    @Override
    void electrify() {
        System.out.print("洗衣机开始通电 -> ");
    }

    @Override
    void start() {
        System.out.println("洗衣机启动");
    }
}
