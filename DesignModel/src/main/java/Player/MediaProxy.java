package Player;

public class MediaProxy implements Media{
    private Media realMedia;
    private String user;

    public MediaProxy(Media realMedia, String user){
        this.realMedia= realMedia;
        this.user = user;
    }

    @Override
    public void play() {
        if (!"admin".equals(user)) {
            System.out.println("权限不足，无法播放！");
            return;
        }
        System.out.println("权限验证成功");
        realMedia.play();
        System.out.println("日志记录：" + getFilename(realMedia) + " 已播放");
    }

    @Override
    public String getFilename() {
        return realMedia.getFilename();
    }

    // 区分Playlist和一般Media的filename
    private String getFilename(Media media) {
        if (media instanceof BaseMedia) {
            return ((BaseMedia) media).filename;
        } else if (media instanceof Playlist) {
            return ((Playlist) media).getLogName();
        }   
        return "未知媒体";
    }
}
