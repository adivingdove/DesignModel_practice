package HomeControl;

// 命令模式的接口
public interface Command {
    void execute();
    void undo();
}
