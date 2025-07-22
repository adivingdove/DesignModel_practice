package Adapter;

public class Client {
    public static void main(String[]args){
        PowerSource220V powerSource220V = new PowerSource220V();
        Power5V adapter = new VoltageAdapter(powerSource220V);
        System.out.println("原始电压："+powerSource220V.output220V()+"V");
        int voltage = adapter.output5V();
        System.out.println("通过适配器转换后电压："+voltage+"V");
        if(voltage == 5){
            System.out.println("手机正在使用5V电压充电");
        }
    }
}
