package Command;

public class RemoteController {
    private Command lightOnCommand, fanOnCommand, TVOnCommand ;
    boolean lightOn = false;
    boolean fanOn = false;
    boolean tvOn = false;
    public RemoteController(Command lightOnCommand,Command fanOnCommand, Command TVOnCommand){
        this.fanOnCommand= fanOnCommand;
        this.lightOnCommand = lightOnCommand;
        this.TVOnCommand = TVOnCommand;
    }

    public void button_zero(){
        System.out.println("按下按钮0");
        if(lightOn){
            lightOnCommand.undo();
        }else{
            lightOnCommand.execute();
        }
    }

    public void button_one(){
        System.out.println("按下按钮1");
        if(fanOn){
            fanOnCommand.undo();
        }else{
            fanOnCommand.execute();
        }
    }

    public void button_two(){
        System.out.println("按下按钮2");
        if(tvOn){
            TVOnCommand.undo();
        }else{
            TVOnCommand.execute();
        }
    }
}
