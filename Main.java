// package com.edgeai;

// import com.edgeai.accelerator.CPUAccelerator;
// import com.edgeai.accelerator.Accelerator;
// import com.edgeai.model.Model;
// import com.edgeai.model.MobileNetModel;
// import com.edgeai.config.ConfigLoader;

// public class Main {

//     public static void main(String[] args) {

//         System.out.println("=== Edge AI Inference Optimization Framework ===");

//         ConfigLoader config = new ConfigLoader();

//         Model model = new MobileNetModel();
//         System.out.println("Loaded Model: " + model.getName());

//         Accelerator accelerator = new CPUAccelerator();
//         System.out.println("Selected Accelerator: " + accelerator.getName());

//         System.out.println("Compute Power: " + accelerator.getComputePower() + " GFLOPS");
//         System.out.println("Memory Bandwidth: " + accelerator.getMemoryBandwidth() + " GB/s");
//         System.out.println("Power Consumption: " + accelerator.getPowerConsumption() + " W");

//         System.out.println("Framework Initialized Successfully");
//     }
// }


// package com.edgeai;

// import com.edgeai.accelerator.*;
// import com.edgeai.config.ConfigLoader;
// import com.edgeai.evaluation.PerformanceAnalyzer;
// import com.edgeai.inference.InferenceEngine;
// import com.edgeai.inference.InferenceResult;
// import com.edgeai.model.*;

// public class Main {

//     public static void main(String[] args) {

//         System.out.println("=== Edge AI Inference Optimization Framework ===");

//         ConfigLoader config = new ConfigLoader();

//         Model model = new MobileNetModel();
//         Accelerator accelerator = new CPUAccelerator();

//         System.out.println("Loaded Model: " + model.getName());
//         System.out.println("Selected Accelerator: " + accelerator.getName());

//         // Run inference
//         InferenceEngine engine = new InferenceEngine();
//         InferenceResult result = engine.runInference(model, accelerator);

//         // Analyze performance
//         PerformanceAnalyzer analyzer = new PerformanceAnalyzer();
//         analyzer.printReport(result);

//         System.out.println("Day-2 Execution Completed");
//     }
// }


// package com.edgeai;

// import com.edgeai.accelerator.*;
// import com.edgeai.evaluation.PerformanceAnalyzer;
// import com.edgeai.inference.InferenceEngine;
// import com.edgeai.inference.InferenceResult;
// import com.edgeai.model.*;
// import com.edgeai.optimization.QuantizationOptimizer;

// public class Main {

//     public static void main(String[] args) {

//         System.out.println("=== Edge AI Inference Optimization Framework ===");

//         Model originalModel = new MobileNetModel();

//         QuantizationOptimizer optimizer = new QuantizationOptimizer();
//         Model optimizedModel = optimizer.optimize(originalModel);

//         Accelerator[] accelerators = {
//                 new CPUAccelerator(),
//                 new GPUAccelerator(),
//                 new NPUAccelerator()
//         };

//         InferenceEngine engine = new InferenceEngine();
//         PerformanceAnalyzer analyzer = new PerformanceAnalyzer();

//         for (Accelerator acc : accelerators) {

//             System.out.println("\n--- Accelerator: " + acc.getName() + " ---");

//             InferenceResult originalResult =
//                     engine.runInference(originalModel, acc);
//             System.out.print("Original Model → ");
//             analyzer.printReport(originalResult);

//             InferenceResult optimizedResult =
//                     engine.runInference(optimizedModel, acc);
//             System.out.print("Optimized Model → ");
//             analyzer.printReport(optimizedResult);
//         }

//         System.out.println("\nDay-3 Optimization & Comparison Completed");
//     }
// }


package com.edgeai;

import com.edgeai.accelerator.*;
import com.edgeai.evaluation.*;
import com.edgeai.inference.*;
import com.edgeai.model.*;
import com.edgeai.optimization.QuantizationOptimizer;
import com.edgeai.utils.CSVWriter;

public class Main {

public static void main(String[] args) {

        System.out.println("=== Edge AI Inference Optimization Framework ===");

        Model originalModel = new MobileNetModel();
        Model optimizedModel =
                new QuantizationOptimizer().optimize(originalModel);

        Accelerator[] accelerators = {
                new CPUAccelerator(),
                new GPUAccelerator(),
                new NPUAccelerator()
        };

        InferenceEngine engine = new InferenceEngine();
        PerformanceAnalyzer analyzer = new PerformanceAnalyzer();
        EnergyEstimator energyEstimator = new EnergyEstimator();
        MemoryEstimator memoryEstimator = new MemoryEstimator();

        for (Accelerator acc : accelerators) {

            System.out.println("\n--- Accelerator: " + acc.getName() + " ---");

            // Original model
            InferenceResult r1 = engine.runInference(originalModel, acc);
            System.out.println("Original Model:");
            analyzer.printDetailedReport(originalModel, acc, r1);

            CSVWriter.writeLine(
                    acc.getName(),
                    originalModel.getName(),
                    r1.getLatencyMs(),
                    energyEstimator.estimateEnergy(r1, acc),
                    memoryEstimator.estimateMemory(originalModel)
            );

            // Optimized model
            InferenceResult r2 = engine.runInference(optimizedModel, acc);
            System.out.println("Optimized Model:");
            analyzer.printDetailedReport(optimizedModel, acc, r2);

            CSVWriter.writeLine(
                    acc.getName(),
                    optimizedModel.getName(),
                    r2.getLatencyMs(),
                    energyEstimator.estimateEnergy(r2, acc),
                    memoryEstimator.estimateMemory(optimizedModel)
            );
        }

        System.out.println("\nDay-4 Energy & Memory Evaluation Completed");
    }
}




