package com.example.api;

import com.example.model.OptimizationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class OptimizationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testOptimizeEndpoint() throws Exception {
        OptimizationRequest req = new OptimizationRequest();
        req.setFormulas(Arrays.asList("formula1", "formula2"));
        req.setContainers(Arrays.asList("A", "B", "C"));

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(req);

        mockMvc.perform(post("/api/optimize")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk());
    }
}