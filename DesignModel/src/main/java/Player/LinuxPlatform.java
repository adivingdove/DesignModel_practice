package Player;

public class LinuxPlatform implements Platform{
    @Override
    public void decode(String filename) {
        System.out.println("播放媒体："+filename+"（Linux平台）");
    }
}
