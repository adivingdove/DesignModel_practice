package Mediator;

public class Curtain extends Device{
    public Curtain(SmartMediator mediator) {
        super(mediator);
    }

    public void withdraw(){
        System.out.println("Curtain已打开");
        sendNotification("Open");
    }

    @Override
    public void sendNotification(String event) {
        mediator.notify(this,event);
    }
}
