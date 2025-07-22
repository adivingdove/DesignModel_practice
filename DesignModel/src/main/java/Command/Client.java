package Command;

public class Client {
    public static void main(String []args){
        Command lightOnCommand, fanOnCommand, tvOnCommand;
        lightOnCommand = new LightOnCommand();
        fanOnCommand = new FanOnCommand();
        tvOnCommand = new TVOnCommand();
        RemoteController remoteController = new RemoteController(lightOnCommand,fanOnCommand,tvOnCommand);


        remoteController.button_zero();
        System.out.println();
        remoteController.button_one();
        System.out.println();
        remoteController.button_two();
    }
}
