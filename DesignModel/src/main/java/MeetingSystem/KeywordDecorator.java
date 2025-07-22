package MeetingSystem;

// 关键词装饰器
public class KeywordDecorator extends RecordDecorator{
    private String content;

    public KeywordDecorator(MeetingRecord record) {
        super(record);
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return "【关键词】"+content;
    }
}
