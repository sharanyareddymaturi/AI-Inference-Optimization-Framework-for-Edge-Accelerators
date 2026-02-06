package com.edgeai.accelerator;

public class GPUAccelerator implements Accelerator {

    @Override
    public String getName() {
        return "GPU";
    }

    @Override
    public double getComputePower() {
        return 200.0;
    }

    @Override
    public double getMemoryBandwidth() {
        return 150.0;
    }

    @Override
    public double getPowerConsumption() {
        return 75.0;
    }
}

