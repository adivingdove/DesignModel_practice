package HomeControl;

public class VoiceHandler extends Handler{
    @Override
    public void handleRequest(String command) {
        System.out.println("用户：语音输入："+command);
        if(next!=null){
            System.out.println(this.getClass().getSimpleName()+"处理并交由"+next.getClass().getSimpleName());
            next.handleRequest(command);
        }
    }
}
