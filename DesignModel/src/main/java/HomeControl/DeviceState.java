package HomeControl;

// 状态模式接口
public interface DeviceState {
    void handle(Device device);
}
