package Proxy;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost) {
        System.out.println("连接到 "+serverhost);
    }
}
