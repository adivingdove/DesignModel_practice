package Proxy;

public class Client {
    public static void main(String []args){
        Internet internet = new ProxyInternet();

        internet.connectTo("google.com");
        internet.connectTo("wikipedia.com");
        internet.connectTo("banned.com");
    }
}
