package SmartDevice;

public class HuaweiDeviceFactory implements AbstractDeviceFactory{

    @Override
    public Light createLight() {
        return new HuaweiLight();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new HuaweiAirConditioner();
    }

    @Override
    public SpeakerBuilder createSpeakerBuilder(){
        return new HuaweiSpeakerBuilder();
    }
}
