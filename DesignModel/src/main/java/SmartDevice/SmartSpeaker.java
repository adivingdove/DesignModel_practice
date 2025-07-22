package SmartDevice;

public class SmartSpeaker implements Speaker {
    private String VoiceRecognition;
    private String wiFi;
    private String soundEffect;

    public void setVoiceRecognition(String va) { VoiceRecognition = va; }
    public void setwiFi(String wifi) { wiFi = wifi; }
    public void setsoundEffect(String sound) { soundEffect = sound; }


    public void initialize() {
        System.out.println("SmartSpeaker 初始化：语音识别=" + VoiceRecognition + ", WiFi=" + wiFi + ", 音效=" + soundEffect);
    }


    public SmartDevice clone() {
        try {
            return (SmartDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toString() {
        return "SmartSpeaker(" + VoiceRecognition + ")";
    }
}
