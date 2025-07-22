package Player;

public abstract class MediaDecorator implements Media{
    private Media media;
    MediaDecorator(Media media){
        this.media = media;
    }

    @Override
    public void play() {
        media.play();
    }

    @Override
    public String getFilename() {
        return media.getFilename();
    }
}
