package MeetingSystem;

import java.util.Stack;

// 命令调用者
public class Invoker {
    // 存历史记录
    private Stack<Command> history = new Stack<>();

    // 运行命令
    public void run(Command command){
        command.execute();
        history.push(command);
    }


    // 撤销命令
    public void undo(){
        if(!history.isEmpty()){
            Command last = history.pop();
            last.undo();
        }else{
            System.out.println("无可撤销的命令！");
        }
    }
}
