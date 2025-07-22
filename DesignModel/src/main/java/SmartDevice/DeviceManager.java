package SmartDevice;

import java.util.*;

public class DeviceManager {
    private static volatile DeviceManager instance;
    private List<SmartDevice> devices = new ArrayList<>();

    private DeviceManager() {}

    public static DeviceManager getInstance() {
        if (instance == null) {
            synchronized (DeviceManager.class) {
                if (instance == null) {
                    instance = new DeviceManager();
                }
            }
        }
        return instance;
    }

    public void register(SmartDevice device) {
        devices.add(device);
        System.out.println("设备已注册到 DeviceManager: " + device);
    }
}

