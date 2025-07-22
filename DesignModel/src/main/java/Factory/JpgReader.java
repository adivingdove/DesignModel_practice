package Factory;

public class JpgReader implements ImageReader{
    @Override
    public void read(){
        System.out.println("读取JPG图片");
    }
}
