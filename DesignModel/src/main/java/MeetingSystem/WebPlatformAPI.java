package MeetingSystem;

// Web平台API
public class WebPlatformAPI implements PlatformAPI{
    @Override
    public void videoOn() {
        System.out.println("Web视频已打开");
    }

    @Override
    public void videoOff() {
        System.out.println("Web视频已关闭");
    }

    @Override
    public void audioOn() {
        System.out.println("Web音频已打开");
    }

    @Override
    public void audioOff() {
        System.out.println("Web音频已关闭");
    }
}
