package HomeControl;

// 抽象设备类 状态模式
public abstract class Device {
    // 持有状态对象
    private DeviceState state;
    private String name;

    public Device(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public DeviceState getState(){
        return state;
    }

    public void setState(DeviceState state){
        this.state = state;
    }

    // 请求方法，用于触发状态改变，将当前设备对象作为参数传入state的方法中
    public void request(){
        state.handle(this);
    }

    abstract void on();
    abstract void off();
}
