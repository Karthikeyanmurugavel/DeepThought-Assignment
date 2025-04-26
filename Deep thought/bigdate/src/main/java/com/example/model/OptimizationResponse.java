package com.example.model;

import java.util.List;

public class OptimizationResponse {
    private List<String> optimalPlan;
    private long computationTimeMs;

    public OptimizationResponse(List<String> optimalPlan, long computationTimeMs) {
        this.optimalPlan = optimalPlan;
        this.computationTimeMs = computationTimeMs;
    }

    public List<String> getOptimalPlan() { return optimalPlan; }
    public void setOptimalPlan(List<String> optimalPlan) { this.optimalPlan = optimalPlan; }

    public long getComputationTimeMs() { return computationTimeMs; }
    public void setComputationTimeMs(long computationTimeMs) { this.computationTimeMs = computationTimeMs; }
}