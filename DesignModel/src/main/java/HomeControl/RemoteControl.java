package HomeControl;

import java.util.ArrayDeque;
import java.util.Deque;


// 命令模式的控制器类
public class RemoteControl {
    private Command command;

    private Deque<Command> history = new ArrayDeque<>();
    
    RemoteControl(){}

    public void setCommand(Command command){
        this.command = command;
    }


    // 按钮
    public void pressButton(){
        command.execute();
        history.push(command);      // 添加到历史中
    }

    // 撤销
    public void pressUndo(){
        if(!history.isEmpty()){
            Command lastCommand = history.pop();    // 弹出
            lastCommand.undo();
        }else{
            System.out.println("没有可以撤销的命令");
        }
    }
}
