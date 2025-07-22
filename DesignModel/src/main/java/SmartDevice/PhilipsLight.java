package SmartDevice;

public class PhilipsLight implements Light {

    @Override
    public void initialize() {

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
