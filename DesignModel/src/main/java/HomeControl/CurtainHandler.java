package HomeControl;


// 责任链模式的实现类
public class CurtainHandler extends Handler{
    @Override
    public void handleRequest(String command) {
        System.out.println("CurtainHandler 处理窗帘指令：拉上窗帘");
        if (next != null) next.handleRequest(command);
    }
}
