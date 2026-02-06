package com.edgeai.inference;

public class InferenceResult {

    private double latencyMs;

    public InferenceResult(double latencyMs) {
        this.latencyMs = latencyMs;
    }

    public double getLatencyMs() {
        return latencyMs;
    }
}

