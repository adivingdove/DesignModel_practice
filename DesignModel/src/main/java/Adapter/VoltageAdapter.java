package Adapter;

public class VoltageAdapter implements Power5V{
    private PowerSource220V powerSource220V;

    public VoltageAdapter(PowerSource220V powerSource220V){
        this.powerSource220V = powerSource220V;
    }

    @Override
    public int output5V() {
        int inputVoltage = powerSource220V.output220V();
        int outputVoltage = inputVoltage / 44;
        System.out.println("");
        return outputVoltage;
    }
}
