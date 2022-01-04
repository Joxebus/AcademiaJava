package mx.com.sintelti.testing;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import mx.com.sintelti.entity.DispositivoElectronico;

@Component("tester")
public class TestDevice {

    @PostConstruct
    public void init() {
        System.out.println("Inicializando objeto tester");
    }

    @Resource(name = "devices")
    private List<DispositivoElectronico> devices;

    public void testDevice(DispositivoElectronico device) {
        device.turnOn();
        device.play();
        device.stop();
        device.turnOff();
    }

    public void addDevice(DispositivoElectronico device) {
        devices.add(device);
    }

    public void testDevices() {
        for (DispositivoElectronico device : devices) {
            testDevice(device);
        }
    }

    public List<DispositivoElectronico> getDevices() {
        return devices;
    }

    public void setDevices(List<DispositivoElectronico> devices) {
        this.devices = devices;
    }


}
