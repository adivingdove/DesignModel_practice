package MeetingSystem;

import java.time.LocalDateTime;
import java.util.List;

// 会议创建者接口，定义创建会议的方法
public interface MeetingBuilder {
    void setAgenda(String agenda);
    void setTime(LocalDateTime time);
    void setHost(User host);
    void setParticipants(List<User> users);

    Meeting getResult();
}
