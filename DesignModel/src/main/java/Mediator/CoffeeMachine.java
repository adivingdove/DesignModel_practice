package Mediator;

public class CoffeeMachine extends Device{
    public CoffeeMachine(SmartMediator mediator) {
        super(mediator);
    }

    public void start(){
        System.out.println("CoffeeMachine开始煮咖啡");
    }

    @Override
    public void sendNotification(String event) {

    }
}
