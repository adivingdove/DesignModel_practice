package Build;

public class Director {
    public void construct(ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildMemory();
        builder.buildHardDisk();
        builder.buildMainUnit();
        builder.buildDisplay();
    }
}
