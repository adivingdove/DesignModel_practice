package Build;

public class Computer {
    private String cpu;
    private String memory;
    private String hardDisk;
    private String mainUnit;
    private String display;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setMainUnit(String mainUnit) {
        this.mainUnit = mainUnit;
    }

    public void showInfo() {
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("Hard Disk: " + hardDisk);
        System.out.println("Main Unit: " + mainUnit);
        System.out.println("Display: " + display);
    }
}