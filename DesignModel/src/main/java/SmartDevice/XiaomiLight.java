package SmartDevice;

public class XiaomiLight implements Light {
    @Override
    public void initialize() {
        System.out.println("XiaomiLight 初始化：亮度80%，支持米家协议");
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
