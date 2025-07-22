package Build;

public class DesktopBuilder extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Intel i7");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("32GB");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("1TB HDD");
    }

    @Override
    public void buildMainUnit() {
        computer.setMainUnit("Tower case");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("24 inch");
    }
}
