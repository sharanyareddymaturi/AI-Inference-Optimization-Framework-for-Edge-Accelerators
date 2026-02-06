package com.edgeai.evaluation;

import com.edgeai.accelerator.Accelerator;
import com.edgeai.inference.InferenceResult;

public class EnergyEstimator {

    public double estimateEnergy(InferenceResult result, Accelerator accelerator) {
        double latencySeconds = result.getLatencyMs() / 1000.0;
        return accelerator.getPowerConsumption() * latencySeconds;
    }
}
