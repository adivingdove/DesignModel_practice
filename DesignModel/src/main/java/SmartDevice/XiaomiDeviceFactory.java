package SmartDevice;

public class XiaomiDeviceFactory implements AbstractDeviceFactory {
    public Light createLight() {
        return new XiaomiLight();
    }
    public AirConditioner createAirConditioner() {
        return new XiaomiAirConditioner();
    }
    public SpeakerBuilder createSpeakerBuilder() {
        return new XiaomiSpeakerBuilder();
    }
}