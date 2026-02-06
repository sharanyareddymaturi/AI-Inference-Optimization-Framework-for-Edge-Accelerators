package com.edgeai.model;

public class QuantizedMobileNetModel implements Model {

    @Override
    public String getName() {
        return "MobileNet-INT8 (Quantized)";
    }

    @Override
    public int getNumberOfLayers() {
        return 28;
    }

    @Override
    public long getParameterCount() {
        return 2100000; // ~50% reduced
    }

    @Override
    public double getModelSizeMB() {
        return 8.0;
    }
}

