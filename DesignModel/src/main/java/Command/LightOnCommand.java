package Command;

public class LightOnCommand implements Command{
    private Light light = new Light();
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
