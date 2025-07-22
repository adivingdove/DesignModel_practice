package Build;

public class LaptopBuilder extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("Intel i5");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("512GB SSD");
    }

    @Override
    public void buildMainUnit() {
        computer.setMainUnit("Compact case");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("13.3 inch");
    }
}

