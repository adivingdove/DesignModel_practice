package MeetingSystem;


// 性能优先策略，实现SchedulingStrategy接口
public class PerformanceFirstStrategy implements SchedulingStrategy{
    @Override
    public void schedule() {
        System.out.println("【策略】使用性能优先策略");
    }
}
