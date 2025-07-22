package MeetingSystem;

public class Client {
    public static void main(String[] args) {
        System.out.println("UI模拟：用户点击『发起会议』");
        // 创建命令执行器
        Invoker invoker = new Invoker();

        // 1. 使用建造者构建会议对象
        System.out.println();
        System.out.println("-> 1. 系统使用建造者构建会议对象");
        Director director = new Director();
        MeetingBuilder builder = new ConcreteMeetingBuilder();
        Meeting meeting = director.construct(builder);
        meeting.dispMeetingInfo();

        // 2. 选择 Web 平台组件工厂，创建 UI / 通知器
        System.out.println();
        System.out.println("-> 2. 选择 Web 平台组件工厂，创建 UI/通知器");
        ComponentFactory factory = new WebComponentFactory();       // 抽象工厂
        PlatformAPI api = new WebPlatformAPI();                     // 桥接模式 —— 将抽象与实现部分分离

        // 3. 创建会议系统并设置会议数据
        System.out.println();
        System.out.println("-> 3. 调用MeetingSystem.createMeeting()触发一系列操作");
        MeetingSystem system = new MeetingSystem(factory, api);
        system.setMeeting(meeting);

        // 调用 createMeeting() 启动会议系统流程
        system.createMeeting();

        // 4. 注册观察者
        System.out.println();
        System.out.println("-> 4. 注册观察者：前端UI、日志模块、远程监听器");
        system.registerObserver(new UIObserver());
        system.registerObserver(new LoggerObserver());
        system.registerObserver(new RemoteServiceObserver());
        system.setStatus("新状态");

        // 5. 应用 PerformanceFirst 策略
        System.out.println();
        System.out.println("-> 5. 应用PerformanceFirst策略");
        system.setSchedulingStrategy(new PerformanceFirstStrategy());
        system.executeStrategy();

        // 6. 添加关键词装饰器
        System.out.println();
        System.out.println("-> 6. 添加关键词分析记录器装饰器");
        KeywordDecorator keywordDecorator = new KeywordDecorator(system.getRecord());
        keywordDecorator.setContent("梦想 汗水 坚持");


        // 7. 用户点击“撤销会议”——命令 + 撤销
        System.out.println();
        System.out.println("-> 7. 用户点击“撤销会议”，命令执行undo(),回滚创建动作");


        // 执行“创建会议”命令
        Command createCommand = new CreateMeetingCommand(system);
        invoker.run(createCommand);
        System.out.println("----------");

        // 撤销上一步的会议创建命令
        invoker.undo();
    }
}
