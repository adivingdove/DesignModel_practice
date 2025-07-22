package Player;

public class SubtitleDecorator extends MediaDecorator{
    SubtitleDecorator(Media media) {
        super(media);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("-> 字幕开启");
    }
}
