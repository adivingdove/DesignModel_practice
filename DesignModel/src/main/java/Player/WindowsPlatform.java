package Player;

public class WindowsPlatform implements Platform{
    @Override
    public void decode(String filename) {
        System.out.println("播放媒体："+filename+"（Windows平台）");
    }
}
