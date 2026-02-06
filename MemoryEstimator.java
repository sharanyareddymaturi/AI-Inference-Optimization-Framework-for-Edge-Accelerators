package com.edgeai.evaluation;

import com.edgeai.model.Model;

public class MemoryEstimator {

    public double estimateMemory(Model model) {
        return model.getModelSizeMB();
    }
}
