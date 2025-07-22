package MeetingSystem;

// Windows平台API实现
public class WindowsPlatformAPI implements PlatformAPI{
    @Override
    public void videoOn() {
        System.out.println("Windows视频已打开");
    }

    @Override
    public void videoOff() {
        System.out.println("Windows视频已关闭");
    }

    @Override
    public void audioOn() {
        System.out.println("Windows音频已打开");
    }

    @Override
    public void audioOff() {
        System.out.println("Windows音频已关闭");
    }
}
