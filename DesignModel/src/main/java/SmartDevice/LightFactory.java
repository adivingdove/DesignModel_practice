package SmartDevice;

public class LightFactory implements DeviceFactory {
    private AbstractDeviceFactory brandFactory;

    public LightFactory(AbstractDeviceFactory factory) {
        this.brandFactory = factory;
    }

    @Override
    public SmartDevice createDevice() {
        return brandFactory.createLight();
    }
}