package MeetingSystem;

// 策略模式，策略模式定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。
public class Scheduler {
    private SchedulingStrategy strategy;

    public void setStrategy(SchedulingStrategy strategy){
        this.strategy= strategy;
    }

    public SchedulingStrategy getStrategy() {
        return strategy;
    }

    public void executeStrategy(){
        if(strategy!=null){
            strategy.schedule();
        }else{
            System.out.println("未设置策略！请重试");
        }
    }
}
