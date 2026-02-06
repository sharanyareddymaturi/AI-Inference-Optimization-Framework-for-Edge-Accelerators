package com.edgeai.evaluation;

import com.edgeai.accelerator.Accelerator;
import com.edgeai.inference.InferenceResult;
import com.edgeai.model.Model;

public class PerformanceAnalyzer {

    private EnergyEstimator energyEstimator = new EnergyEstimator();
    private MemoryEstimator memoryEstimator = new MemoryEstimator();

    public void printDetailedReport(
            Model model,
            Accelerator accelerator,
            InferenceResult result) {

        double energy = energyEstimator.estimateEnergy(result, accelerator);
        double memory = memoryEstimator.estimateMemory(model);

        System.out.println("Inference Latency : " +
                String.format("%.3f", result.getLatencyMs()) + " ms");
        System.out.println("Energy Consumption: " +
                String.format("%.4f", energy) + " Joules");
        System.out.println("Memory Usage      : " +
                String.format("%.2f", memory) + " MB");
    }
}


