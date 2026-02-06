package com.edgeai.utils;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public static void writeLine(
            String accelerator,
            String model,
            double latency,
            double energy,
            double memory) {

        try (FileWriter writer =
                    new FileWriter("results.csv", true)) {

            writer.append(accelerator).append(",");
            writer.append(model).append(",");
            writer.append(String.format("%.3f", latency)).append(",");
            writer.append(String.format("%.4f", energy)).append(",");
            writer.append(String.format("%.2f", memory)).append("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

