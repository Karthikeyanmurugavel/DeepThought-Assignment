package com.example.api;

import com.example.model.OptimizationRequest;
import com.example.model.OptimizationResponse;
import com.example.service.OptimizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OptimizationController {

    @Autowired
    private OptimizationService optimizationService;

    @PostMapping("/optimize")
    public OptimizationResponse optimize(@RequestBody OptimizationRequest request) {
        return optimizationService.optimize(request);
    }
}