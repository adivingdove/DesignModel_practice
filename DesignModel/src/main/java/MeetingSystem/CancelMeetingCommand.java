package MeetingSystem;

// 取消会议的命令类
public class CancelMeetingCommand implements Command{
    // 持有System类的引用，以便调用其方法
    private MeetingSystem system;

    // 构造函数，传入System类的实例
    public CancelMeetingCommand(MeetingSystem system){
        this.system = system;
    }
 
    // 实现Command接口的execute方法
    @Override
    public void execute() {
        System.out.println("执行命令：取消会议");
        system.endMeeting();
    }

    // 实现Command接口的undo方法
    @Override
    public void undo() {
        System.out.println("撤销命令：取消会议");
        system.startMeeting();
    }
}
