package Player;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Media {
    private String name;
    private List<Media> items = new ArrayList<>();
    private String logName = "";

    public Playlist(String name) {
        this.name = name;
    }

    // 获取Playlist中所有Media的filename，用于日志记录
    public String getLogName() {
        return logName;
    }

    public void add(Media media) {
        items.add(media);
    }

    @Override
    public void play() {
        System.out.println("播放子播放列表：" + name);
        for(Media item:items){
            item.play();
            logName += item.getFilename();
        }
    }

    // 重写getFilename方法，返回Playlist中所有Media的filename
    @Override
    public String getFilename() {
        return logName;
    }
}
