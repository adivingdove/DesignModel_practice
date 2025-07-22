package Factory;

public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader createReader() {
        return new JpgReader();
    }
}
