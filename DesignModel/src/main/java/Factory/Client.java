package Factory;


import java.util.List;

public class Client
{
    public static void main(String args[])
    {
        try
        {
            List<Object> factories = XMLUtil.getBeanList();
            for (Object obj : factories) {
                ImageReaderFactory factory = (ImageReaderFactory) obj;
                ImageReader reader = factory.createReader();
                reader.read();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
