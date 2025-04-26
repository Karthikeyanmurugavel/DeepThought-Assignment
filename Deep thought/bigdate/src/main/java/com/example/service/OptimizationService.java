package com.example.service;

import com.example.model.OptimizationRequest;
import com.example.model.OptimizationResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OptimizationService {

    public OptimizationResponse optimize(OptimizationRequest request) {
        long start = System.currentTimeMillis();

        // Simple placeholder logic: just return the containers in reverse order as the "optimal" plan
        List<String> plan = new ArrayList<>(request.getContainers());
        java.util.Collections.reverse(plan);

        long end = System.currentTimeMillis();
        return new OptimizationResponse(plan, end - start);
    }
}