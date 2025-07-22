package Player;

public class MP4 extends BaseMedia{
    protected String filename ;
    private Platform platform;

    public MP4(String filename, Platform platform){
        this.filename = filename;
        this.platform = platform;
    }

    public MP4(String filename){
        this.filename = filename;
        platform = null;
    }

    @Override
    public void play() {
        if(platform != null) {
            platform.decode(filename);
        }else{
            System.out.println("播放媒体：" + filename);
        }
    }

    @Override
    public String getFilename() {
        return this.filename;
    }
}
