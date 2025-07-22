package HomeControl;

// 命令模式的实现类
public class LightOnCommand implements Command{
    private Light light;

    LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        System.out.print("撤销操作，");
        // light 上一次是开状态
        if(light.getState() instanceof OnState) {
            light.off();
        }else{
            light.on();
        }

    }
}
