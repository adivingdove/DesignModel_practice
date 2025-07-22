package MeetingSystem;

import java.time.LocalDateTime;
import java.util.Arrays;

// Director类，负责构建Meeting对象
public class Director {
    public Meeting construct(MeetingBuilder builder){
        builder.setAgenda("讨论something");
        builder.setTime(LocalDateTime.now().plusDays(1));
        builder.setHost(new User("主持人小林"));
        builder.setParticipants(Arrays.asList(new User("小王"),new User("小李"), new User("小张")));
        return builder.getResult();
    }
}
