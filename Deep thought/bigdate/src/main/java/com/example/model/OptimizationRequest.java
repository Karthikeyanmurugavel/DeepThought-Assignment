package com.example.model;

import java.util.List;

public class OptimizationRequest {
    private List<String> formulas;
    private List<String> containers;

    // Getters and Setters
    public List<String> getFormulas() { return formulas; }
    public void setFormulas(List<String> formulas) { this.formulas = formulas; }

    public List<String> getContainers() { return containers; }
    public void setContainers(List<String> containers) { this.containers = containers; }
}