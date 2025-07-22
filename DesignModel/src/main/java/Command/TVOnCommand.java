package Command;

public class TVOnCommand implements Command{
    private TV tv = new TV();
    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
