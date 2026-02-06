package com.edgeai.optimization;

import com.edgeai.model.Model;
import com.edgeai.model.QuantizedMobileNetModel;

public class QuantizationOptimizer implements Optimizer {

    @Override
    public Model optimize(Model model) {
        System.out.println("Applying Quantization Optimization...");
        return new QuantizedMobileNetModel();
    }

    @Override
    public String getOptimizerName() {
        return "Quantization Optimizer";
    }
}

