package Player;

public class Client {
    public static void main(String[] args) {
        // 桥接模式 ——— 媒体(media)种类与平台(platform)种类的解耦
        Platform windows = new WindowsPlatform();
        Platform linux = new LinuxPlatform();

        Media song1 = new MP3("song1.mp3", windows);
        Media video1 = new MP4("video1.mp4", linux);
        Media video2 = new AviAdapter("video2.avi");    // 适配器模式 ———— Avi 转 MP4

        // 装饰器模式 ———— Subtitle/Effect/Speed 
        Media decoratedSong1 = new SpeedDecorator(new SubtitleDecorator(song1), 1.5);
        Media decoratedVideo1 = new EffectDecorator(video1);

        // 组合模式实现播放列表 ——— 子列表添加歌曲
        Playlist subPlaylist = new Playlist("子列表");
        subPlaylist.add(new MP3("song2.mp3"));

        // 代理模式 —— 权限验证
        Media proxiedMedia = new MediaProxy(subPlaylist, "admin");

        // 外观模式 —— 简化客户端调用复杂子系统
        System.out.println("媒体播放开始：");
        MediaPlayerFacade facade = new MediaPlayerFacade();
        facade.playMedia(decoratedSong1);
        facade.playMedia(decoratedVideo1);
        facade.playMedia(video2);
        facade.playMedia(proxiedMedia);
    }
}

