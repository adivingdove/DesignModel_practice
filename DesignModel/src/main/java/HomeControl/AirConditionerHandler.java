package HomeControl;

// 责任链模式的实现类
public class AirConditionerHandler extends Handler{
    @Override
    public void handleRequest(String command) {
        if(next != null)   {
            System.out.println(this.getClass().getSimpleName()+"处理完毕，交由"+next.getClass().getSimpleName());
        }
    }
}
