package Facade;

public class HomeFacade {
    private AirConditioner1 airConditioner = new AirConditioner1();
    private Light light = new Light();
    private SecuritySystem securitySystem = new SecuritySystem();



    public void homeMode(){
        System.out.println("【回家模式】");
        light.on();
        airConditioner.on();
        securitySystem.off();
    }

    public void awayMode(){
        System.out.println("【离家模式】");
        light.off();
        airConditioner.off();
        securitySystem.off();
    }
}
