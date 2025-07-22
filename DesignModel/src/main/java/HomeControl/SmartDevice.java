package HomeControl;

// 抽象设备类，模板方法模式
public abstract class SmartDevice {
    void startup(){
        checkUp();
        electrify();
        start();
    }

    abstract void checkUp();
    abstract void electrify();
    abstract void start();
}
