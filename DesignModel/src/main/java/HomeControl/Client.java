package HomeControl;

public class Client {
    public static void main(String[]args){
        // 命令模式 —— 以curtain和light为例 + 撤销
        System.out.println("【命令模式】 以light和curtain为例");
        Light light = new Light("light");
        Curtain curtain = new Curtain("curtain");

        Command lightOn = new LightOnCommand(light);
        Command curtainOpen = new CurtainOpenCommand(curtain);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.setCommand(curtainOpen);
        remote.pressButton();
        remote.pressUndo();     // 撤销上一次操作
        remote.pressUndo();

        System.out.println("-----------------------");

        // 状态模式 —— 以curtain为例
        System.out.println("【状态模式】 以curtain为例");
        curtain.setState(new OffState());
        curtain.request();
        curtain.setState(new OnState());
        curtain.request();

        System.out.println("-----------------------");


        // 观察者模式
        System.out.println("【观察者模式】 以air-conditioner为例");
        Subject sensor = new Sensor();
        AirConditioner acObserver = new AirConditioner();
        sensor.registerSubscriber(acObserver);
        sensor.notifySubscriber("检测到温度下降");

        System.out.println("-----------------------");

        // 模板方法模式
        System.out.println("【模板方法模式】 以washing machine为例");
        SmartDevice smartWM = new WashingMachine();
        smartWM.startup();

        System.out.println("-----------------------");

        // 责任链模式
        System.out.println("【责任链模式】 voice -> air-conditioner -> curtain");
        Handler voice = new VoiceHandler();
        Handler acHandler = new AirConditionerHandler();
        Handler curtainHandler = new CurtainHandler();
        voice.setNext(acHandler);
        acHandler.setNext(curtainHandler);
        voice.handleRequest("打开空调并拉上窗帘");

        System.out.println("-----------------------");

        // 策略模式
        System.out.println("【策略模式】 以air-conditioner为例");
        AirConditioner ac = new AirConditioner();
        ac.setStrategy(new FastResponseStrategy());
        ac.performOperation();
        System.out.println("-----");
        ac.setStrategy(new EnergySavingStrategy());
        ac.performOperation();
    }
}
