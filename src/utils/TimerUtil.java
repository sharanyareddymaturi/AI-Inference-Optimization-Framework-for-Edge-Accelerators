package com.edgeai.utils;

public class TimerUtil {

    private long startTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public long stop() {
        return System.nanoTime() - startTime;
    }
}

