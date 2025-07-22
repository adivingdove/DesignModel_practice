package MeetingSystem;

// 会议控制类，负责控制会议的开始、结束和静音等操作，传入平台API接口实现桥接模式
public abstract class MeetingController {
    protected PlatformAPI platformAPI;

    public MeetingController(PlatformAPI platformAPI){
        this.platformAPI = platformAPI;
    }

    public abstract void start();
    public abstract void muteAll();
    public abstract void stop();
}
