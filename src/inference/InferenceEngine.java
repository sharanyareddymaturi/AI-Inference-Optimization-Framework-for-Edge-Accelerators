package com.edgeai.inference;

import com.edgeai.accelerator.Accelerator;
import com.edgeai.model.Model;

public class InferenceEngine {

    public InferenceResult runInference(Model model, Accelerator accelerator) {

        // Simulated latency calculation
        double latency =
                model.getParameterCount() / (accelerator.getComputePower() * 1000);

        return new InferenceResult(latency);
    }
}
