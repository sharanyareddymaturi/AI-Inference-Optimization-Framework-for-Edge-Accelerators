package com.edgeai.model;

public interface Model {
    String getName();
    int getNumberOfLayers();
    long getParameterCount();
    double getModelSizeMB();
}

