package MeetingSystem;

// 具体会议控制器类，继承自MeetingController并实现其抽象方法
public class ConcreteMeetingController extends MeetingController{
    // 构造函数
    public ConcreteMeetingController(PlatformAPI platformAPI) {
        super(platformAPI);
    }

    @Override
    public void start() {
        System.out.println("启动会议");
        platformAPI.videoOn();
        platformAPI.audioOn();
    }

    @Override
    public void muteAll() {
        System.out.println("全体静音");
        platformAPI.audioOff();
    }

    @Override
    public void stop() {
        System.out.println("结束会议");
        platformAPI.videoOff();
        platformAPI.audioOff();
    }
}
