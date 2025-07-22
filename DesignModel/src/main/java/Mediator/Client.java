package Mediator;

public class Client {
    public static void main(String[]args){
        SmartHomeMediator mediator = new SmartHomeMediator();
        Alarm alarm = new Alarm(mediator);
        Light light = new Light(mediator);
        Curtain curtain = new Curtain(mediator);
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator);

        mediator.register(alarm);
        mediator.register(light);
        mediator.register(curtain);
        mediator.register(coffeeMachine);

        alarm.ring();


    }
}
