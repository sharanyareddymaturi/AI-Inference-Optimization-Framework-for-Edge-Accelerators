package com.edgeai.config;

import java.util.Properties;

public class ConfigLoader {

    private Properties properties;

    public ConfigLoader() {
        properties = new Properties();
        properties.setProperty("accelerator", "CPU");
        properties.setProperty("optimizer", "NONE");
    }

    public String getAcceleratorType() {
        return properties.getProperty("accelerator");
    }

    public String getOptimizerType() {
        return properties.getProperty("optimizer");
    }
}

