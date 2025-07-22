package MeetingSystem;

// 会议记录的装饰器类，实现MeetingRecord接口，并持有MeetingRecord类型的对象
public abstract class RecordDecorator implements MeetingRecord{
    protected MeetingRecord record;

    public RecordDecorator(MeetingRecord record){
        this.record = record;
    }

    @Override
    public abstract String getContent();

}
