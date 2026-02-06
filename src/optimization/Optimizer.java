package com.edgeai.optimization;

import com.edgeai.model.Model;

public interface Optimizer {
    Model optimize(Model model);
    String getOptimizerName();
}

