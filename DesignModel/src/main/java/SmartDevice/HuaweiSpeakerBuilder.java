package SmartDevice;

public class HuaweiSpeakerBuilder implements SpeakerBuilder {
    private SmartSpeaker smartSpeaker = new SmartSpeaker();
    @Override
    public void buildVoiceRecognition() {
        smartSpeaker.setVoiceRecognition("Huawei VoiceRecognition");
    }

    @Override
    public void buildWiFi() {
        smartSpeaker.setwiFi("Huawei WiFi");
    }

    @Override
    public void buildSoundEffect() {
        smartSpeaker.setsoundEffect("Huawei SoundEffect");
    }

    @Override
    public SmartSpeaker getResult() {
        return smartSpeaker;
    }
}
