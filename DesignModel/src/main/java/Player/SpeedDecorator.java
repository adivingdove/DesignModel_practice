package Player;

public class SpeedDecorator extends MediaDecorator{
    private double speed;

    public SpeedDecorator(Media media, double speed) {
        super(media);
        this.speed = speed;
    }


    @Override
    public void play() {
        super.play();
        System.out.println("-> " +speed+"倍速播放");
    }
}
