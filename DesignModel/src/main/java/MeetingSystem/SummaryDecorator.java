package MeetingSystem;

// 会议记录的摘要装饰器
public class SummaryDecorator extends RecordDecorator{
    private String content;
    public SummaryDecorator(MeetingRecord record) {
        super(record);
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return "[摘要]"+content;
    }
}
