package com.everis.main;

import java.util.List;

import com.everis.beans.ElectronicDevice;
import com.everis.test.TestDevice;

public class MainFactory {


    private List<ElectronicDevice> dispositivos;

    public List<ElectronicDevice> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<ElectronicDevice> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void addDevice(ElectronicDevice device) {
        dispositivos.add(device);
    }

    public void testDevices() {
        for (ElectronicDevice device : dispositivos) {
            TestDevice.testDevice(device);
        }
    }

}
