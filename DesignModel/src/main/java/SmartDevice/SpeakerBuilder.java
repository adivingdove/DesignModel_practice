package SmartDevice;

public interface SpeakerBuilder {

    public abstract void buildVoiceRecognition();
    public abstract void buildWiFi();
    public abstract void buildSoundEffect();

    public SmartSpeaker getResult();
}
