package MeetingSystem;

import java.time.LocalDateTime;
import java.util.List;

// 会议实体类，用于存储会议信息
public class Meeting {
    protected String agenda;
    protected LocalDateTime time;
    protected User host;
    protected List<User> users;

    public void dispMeetingInfo(){
        System.out.println("会议议程："+agenda);
        System.out.println("会议时间："+time);
        System.out.println("会议主持人："+host.getName());
        System.out.print("参会成员：");
        for(User user: users){
            System.out.print(user.getName()+" ");
        }
        System.out.println();

    }
    // getter and setter
    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public User getHost() {
        return host;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
