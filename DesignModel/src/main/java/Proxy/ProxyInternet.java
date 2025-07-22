package Proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet realInternet;
    private static final List<String> BlackList = Arrays.asList("banned.com");
    @Override
    public void connectTo(String serverhost) {
        if(BlackList.contains(serverhost)){
            System.out.println("访问被拒绝:"+ serverhost);
            return;
        }

        if(realInternet == null){
            realInternet = new RealInternet();
        }

        realInternet.connectTo(serverhost);
    }
}
