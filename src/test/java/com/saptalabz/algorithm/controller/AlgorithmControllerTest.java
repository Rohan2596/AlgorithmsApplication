package com.saptalabz.algorithm.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@AutoConfigureMockMvc
@SpringBootTest
public class AlgorithmControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void givenValidInput_whenAdded_shouldReturnValidResponse(){
        try {
            MvcResult mvcResult=this.mockMvc.perform(post("/algo")).andReturn();
            Assertions.assertEquals(200,mvcResult.getResponse().getStatus());
            Assertions.assertEquals("Input...",mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
