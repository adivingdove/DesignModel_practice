package Mediator;

public abstract class Device {
    protected SmartMediator mediator;

    public Device (SmartMediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendNotification(String event);
}
