package com.edgeai.model;

public class MobileNetModel implements Model {

    @Override
    public String getName() {
        return "MobileNet";
    }

    @Override
    public int getNumberOfLayers() {
        return 28;
    }

    @Override
    public long getParameterCount() {
        return 4200000;
    }

    @Override
    public double getModelSizeMB() {
        return 16.0;
    }
}

