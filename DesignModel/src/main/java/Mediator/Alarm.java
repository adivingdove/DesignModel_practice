package Mediator;

public class Alarm extends Device{
    public Alarm(SmartMediator mediator) {
        super(mediator);
    }

    public void ring(){
        System.out.println("Alarm响起，通知中介者。");
        sendNotification("Ringing");
    }

    @Override
    public void sendNotification(String event) {
        mediator.notify(this,event);
    }
}
