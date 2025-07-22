package SmartDevice;

public class PhilipsDeviceFactory implements AbstractDeviceFactory{
    @Override
    public Light createLight() {
        return new PhilipsLight();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new PhilipsAirConditioner();
    }

    @Override
    public SpeakerBuilder createSpeakerBuilder() {
        return new PhilipsSpeakerBuilder();
    }
}
