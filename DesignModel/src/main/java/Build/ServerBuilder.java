package Build;

public class ServerBuilder extends ComputerBuilder{
    @Override
    public void buildCpu() {
        computer.setCpu("Intel Xeon");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("64GB ECC");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("2TB SAS");
    }

    @Override
    public void buildMainUnit() {
        computer.setMainUnit("Rack case");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("None");
    }
}
