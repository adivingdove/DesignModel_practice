package HomeControl;

// 具体设备类 （包含策略模式，观察者模式，模板方法模式）
public class AirConditioner extends SmartDevice implements Observer {
    // 策略模式
    private DeviceStrategy strategy;

    public void setStrategy(DeviceStrategy strategy){
        this.strategy = strategy;
    }

    public void performOperation(){
        strategy.execute();
    }

    // 观察者模式
    @Override
    public void update(String message) {
        System.out.println("-> 通知空调");
        System.out.println("空调自动降档运行（策略变更）");
    }

    // 模板方法模式
    @Override
    void checkUp() {
        System.out.print("空调开始检测 -> ");
    }

    @Override
    void electrify() {
        System.out.print("空调开始通电 -> ");
    }

    @Override
    void start() {
        System.out.println("空调启动");
    }

}
