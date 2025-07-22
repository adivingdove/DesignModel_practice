package Mediator;

public class Light extends Device{
    public Light(SmartMediator mediator) {
        super(mediator);
    }

    public void turnOn(){
        System.out.println("Light已开启");
        sendNotification("On");
    }

    @Override
    public void sendNotification(String event) {
        mediator.notify(this,event);
    }
}
