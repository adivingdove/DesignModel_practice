package SmartDevice;

public class AirConditionerFactory implements DeviceFactory{
    private AbstractDeviceFactory brandFactory;

    public AirConditionerFactory(AbstractDeviceFactory factory){
        this.brandFactory = factory;
    }

    @Override
    public SmartDevice createDevice() {
        return brandFactory.createAirConditioner();
    }
}
