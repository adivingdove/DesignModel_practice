package MeetingSystem;

// 具体会议记录类
public class ConcreteMeetingRecord implements MeetingRecord{
    private String content;

    public ConcreteMeetingRecord(String content){
        this.content = content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return "[会议记录]"+content;
    }
}
