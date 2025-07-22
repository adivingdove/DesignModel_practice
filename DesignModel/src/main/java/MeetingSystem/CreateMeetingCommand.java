package MeetingSystem;

// 创建会议命令类
public class CreateMeetingCommand implements Command{
    // 持有System类的引用，以便调用其方法
    private MeetingSystem system;

    // 构造函数，传入System类的实例
    public CreateMeetingCommand(MeetingSystem system){
        this.system = system;
    }

    // 执行命令，调用System类的方法
    @Override
    public void execute() {
        System.out.println("执行命令：启动会议");
        system.startMeeting();
    }
    
    // 撤销命令，调用System类方法
    @Override
    public void undo() {
        System.out.println("撤销命令：启动会议");
        system.endMeeting();
    }
}
