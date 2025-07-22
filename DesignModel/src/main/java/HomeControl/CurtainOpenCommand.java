package HomeControl;

// 命令模式的实现类
public class CurtainOpenCommand implements Command{
    private Curtain curtain;

    CurtainOpenCommand(Curtain curtain){
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.on();
    }

    @Override
    public void undo() {
        System.out.print("撤销操作，");
        // 根据上一次的状态修改
        if(curtain.getState() instanceof OnState) {
            curtain.off();
        }else{
            curtain.on();
        }
    }
}
