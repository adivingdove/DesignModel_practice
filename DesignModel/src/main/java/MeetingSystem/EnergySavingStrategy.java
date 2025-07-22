package MeetingSystem;

// 策略模式，节能策略
public class EnergySavingStrategy implements SchedulingStrategy{
    @Override
    public void schedule() {
        System.out.println("【策略】使用节能优先策略");
    }
}
