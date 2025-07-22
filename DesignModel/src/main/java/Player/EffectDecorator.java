package Player;

public class EffectDecorator extends MediaDecorator{
    EffectDecorator(Media media) {
        super(media);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("-> 音效增强");
    }
}
