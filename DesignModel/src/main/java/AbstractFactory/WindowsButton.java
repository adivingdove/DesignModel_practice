package AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("WindowsButton render");
    }
}
