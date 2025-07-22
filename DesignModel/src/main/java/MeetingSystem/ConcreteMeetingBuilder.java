package MeetingSystem;

import java.time.LocalDateTime;
import java.util.List;

// 具体会议创建者
public class ConcreteMeetingBuilder implements MeetingBuilder{
    // 创建会议对象
    private Meeting meeting = new Meeting();

    // 构建会议对象的方法实现，set方法实现
    @Override
    public void setAgenda(String agenda) {
        meeting.setAgenda(agenda);
    }

    @Override
    public void setTime(LocalDateTime time) {
        meeting.setTime(time);
    }

    @Override
    public void setHost(User host) {
        meeting.setHost(host);
    }

    @Override
    public void setParticipants(List<User> users) {
        meeting.setUsers(users);
    }

    // 返回会议对象
    @Override
    public Meeting getResult() {
        return meeting;
    }
}
