package SmartDevice;

public class PhilipsSpeakerBuilder implements SpeakerBuilder {
    private SmartSpeaker smartSpeaker = new SmartSpeaker();
    @Override
    public void buildVoiceRecognition() {
        smartSpeaker.setVoiceRecognition("Philips VoiceRecognition");
    }

    @Override
    public void buildWiFi() {
        smartSpeaker.setwiFi("Philips WiFi");
    }

    @Override
    public void buildSoundEffect() {
        smartSpeaker.setsoundEffect("Philips SoundEffect");
    }

    @Override
    public SmartSpeaker getResult() {
        return smartSpeaker;
    }
}
