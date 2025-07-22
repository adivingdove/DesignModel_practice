package Factory;

public class GifReader implements ImageReader{

    @Override
    public void read() {
        System.out.println("读取GIF图片");
    }
}
