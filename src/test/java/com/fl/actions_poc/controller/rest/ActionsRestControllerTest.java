package com.fl.actions_poc.controller.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ActionsRestController.class)
public class ActionsRestControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void add_withPositiveParams_200OK() throws Exception {
        mockMvc.perform(get("/api/add")
                        .param("a", "3")
                        .param("b", "4"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(7));
    }

    @Test
    void multiply_withPositiveParams_200OK() throws Exception {
        mockMvc.perform(get("/api/multiply")
                        .param("a", "3")
                        .param("b", "4"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(12));
    }
}