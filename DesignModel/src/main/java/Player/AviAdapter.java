package Player;

public class AviAdapter implements Media {
    private MP4 mp4;
    private String filename;


    public AviAdapter(String aviFile) {
        String converted = aviFile.replace(".avi", ".mp4");
        this.mp4 = new MP4(converted);
        this.filename = aviFile;
    }

    @Override
    public void play() {
        System.out.println("播放媒体："+filename+"（通过适配器转换）");
        mp4.play();
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
