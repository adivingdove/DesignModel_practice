package SmartDevice;

public class PhilipsAirConditioner implements AirConditioner {

    @Override
    public void initialize() {
        System.out.println("Philips SmartAirConditioner 初始化");
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
