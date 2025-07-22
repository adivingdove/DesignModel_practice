package SmartDevice;

public interface AbstractDeviceFactory {
    Light createLight();
    AirConditioner createAirConditioner();
    SpeakerBuilder createSpeakerBuilder();
}
