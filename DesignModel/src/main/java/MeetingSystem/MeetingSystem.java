package MeetingSystem;

// 会议系统类，实现创建会议系统、创建会议、开始会议、结束会议、注册观察者、设置调度策略、执行调度策略、设置状态等方法
public class MeetingSystem {
    private ComponentFactory componentFactory;
    private PlatformAPI platformAPI;
    private MeetingController controller;
    private Director director;
    private Meeting meeting;
    private MeetingStatusManager statusManager;
    private Scheduler scheduler;
    private MeetingRecord record;

    public MeetingSystem(ComponentFactory factory, PlatformAPI api) {
        this.componentFactory = factory;
        this.platformAPI = api;
        this.controller = new ConcreteMeetingController(api);
        this.director = new Director();
        this.statusManager = new MeetingStatusManager();
        this.scheduler = new Scheduler();
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void setRecord(MeetingRecord record) {
        this.record = record;
    }

    public MeetingRecord getRecord() {
        return record;
    }

    public void createMeeting(){

        // 使用建造者创建会议对象
        MeetingBuilder builder = new ConcreteMeetingBuilder();
        this.meeting = director.construct(builder);

        // 工厂创建组件
        UI ui = componentFactory.createUI();
        Notifier notifier = componentFactory.createNotifier();
        NetManager netManager = componentFactory.createNetManager();

        // 初始化流程
        System.out.println("会议创建完成！");
        netManager.connect();
        ui.render();
        notifier.sendNotification("会议通知已发送！");
    }

    public void startMeeting(){
        controller.start();
    }

    public void endMeeting(){
        controller.stop();
    }

    public Meeting getMeeting(){
        return meeting;
    }

    public void registerObserver(Observer observer){
        statusManager.registerObserver(observer);
    }

    public void setSchedulingStrategy(SchedulingStrategy strategy){
        scheduler.setStrategy(strategy);
    }

    public void executeStrategy(){
        scheduler.executeStrategy();
    }

    public void setStatus(String status){
        statusManager.setStatus(status);
    }
}
