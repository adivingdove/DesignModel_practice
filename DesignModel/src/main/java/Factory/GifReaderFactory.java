package Factory;

public class GifReaderFactory implements  ImageReaderFactory{
    @Override
    public ImageReader createReader() {
        return new GifReader();
    }
}
