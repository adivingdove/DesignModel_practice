package HomeControl;

// 责任链模式的抽象类
public abstract class Handler {
    protected Handler next;
    public void setNext(Handler next){
        this.next= next;
    }

    public abstract void handleRequest(String command);
}
