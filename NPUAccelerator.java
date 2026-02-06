package com.edgeai.accelerator;

public class NPUAccelerator implements Accelerator {

    @Override
    public String getName() {
        return "NPU";
    }

    @Override
    public double getComputePower() {
        return 500.0;
    }

    @Override
    public double getMemoryBandwidth() {
        return 300.0;
    }

    @Override
    public double getPowerConsumption() {
        return 20.0;
    }
}
