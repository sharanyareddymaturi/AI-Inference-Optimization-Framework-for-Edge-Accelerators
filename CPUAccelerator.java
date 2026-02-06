package com.edgeai.accelerator;

public class CPUAccelerator implements Accelerator {

    @Override
    public String getName() {
        return "CPU";
    }

    @Override
    public double getComputePower() {
        return 50.0;
    }

    @Override
    public double getMemoryBandwidth() {
        return 20.0;
    }

    @Override
    public double getPowerConsumption() {
        return 15.0;
    }
}

