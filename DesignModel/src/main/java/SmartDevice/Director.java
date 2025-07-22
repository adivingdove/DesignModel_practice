package SmartDevice;

public class Director {
    private SpeakerBuilder builder;

    public Director(SpeakerBuilder builder) {
        this.builder = builder;
    }

    public SmartSpeaker construct() {
        builder.buildSoundEffect();
        builder.buildWiFi();
        builder.buildVoiceRecognition();
        return builder.getResult();
    }
}
