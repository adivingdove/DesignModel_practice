package SmartDevice;

import java.util.*;

enum DeviceType { Light, AirConditioner, Speaker }
enum Brand { Xiaomi, Huawei, Philips }

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用智能家居系统");

        System.out.println("请选择设备类型：[Light, AirConditioner, Speaker]");
        DeviceType deviceType = DeviceType.valueOf(sc.nextLine());

        System.out.println("请选择设备厂商：[Xiaomi, Huawei, Philips]");
        Brand brand = Brand.valueOf(sc.nextLine());

        AbstractDeviceFactory factory = switch (brand) {
            case Xiaomi -> new XiaomiDeviceFactory();
            case Huawei -> new HuaweiDeviceFactory();
            case Philips -> new PhilipsDeviceFactory();
        };

        SmartDevice device = switch (deviceType) {
            case Light -> new LightFactory(factory).createDevice();
            case AirConditioner -> new AirConditionerFactory(factory).createDevice();
            case Speaker -> {
                Director director = new Director(factory.createSpeakerBuilder());
                yield director.construct();
            }
        };

        device.initialize();
        DeviceManager.getInstance().register(device);

        System.out.println("是否部署多个房间？Y/N");
        if(sc.nextLine().equalsIgnoreCase("Y")){
            SmartDevice device2 = device.clone();
            SmartDevice device3 = device.clone();
            System.out.println("设备克隆成功：Room2 使用 " + device2);
            System.out.println("设备克隆成功：Room3 使用 " + device3);
        }
    }
}


