package Command;

public class FanOnCommand implements Command{
    private Fan fan = new Fan();
    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
