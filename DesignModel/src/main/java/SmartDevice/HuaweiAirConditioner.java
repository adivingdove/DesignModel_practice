package SmartDevice;

public class HuaweiAirConditioner implements AirConditioner {
    @Override
    public void initialize() {
        System.out.println("HuaweiAirConditioner 初始化：HarmonyOS 空调协议");
    }

    @Override
    public SmartDevice clone() {
        try {
            return (SmartDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
