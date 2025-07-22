package SmartDevice;

public class HuaweiLight implements Light {

    @Override
    public void initialize() {
        System.out.println("HuaweiSmartLight 初始化：HarmonyOS 电灯协议");
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
