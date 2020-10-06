package com.saptalabz.algorithm.controller;

import com.google.gson.Gson;
import com.jayway.jsonpath.spi.mapper.GsonMappingProvider;
import com.saptalabz.algorithm.dto.AlgorithmDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@AutoConfigureMockMvc
@SpringBootTest
public class AlgorithmControllerTest {

    @Autowired
    MockMvc mockMvc;

    public AlgorithmDTO algorithmDTO;
    public ArrayList inputValue;
    public Gson  gson;

    @BeforeEach
    void setUp() {
        this.inputValue=new ArrayList();
        this.inputValue.add(1);
        this.inputValue.add(2);
        this.inputValue.add(3);
        this.inputValue.add(4);
        this.gson=new Gson();

    }

    @Test
    public void givenValidInput_whenAdded_shouldReturnValidResponse(){
        try {

            this.algorithmDTO=new AlgorithmDTO("Binary",this.inputValue);
            MvcResult mvcResult=this.mockMvc.perform(post("/algo")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(new Gson().toJson(this.algorithmDTO))).andReturn();
            Assertions.assertEquals(200,mvcResult.getResponse().getStatus());
            Assertions.assertEquals("Binary",mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenInValidInput_EmptyName_whenAdded_shouldReturnValidResponse(){
        try {

            this.algorithmDTO=new AlgorithmDTO("",this.inputValue);
            MvcResult mvcResult=this.mockMvc.perform(post("/algo")
                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                    .content(new Gson().toJson(this.algorithmDTO))).andReturn();
            Assertions.assertEquals(200,mvcResult.getResponse().getStatus());
            Assertions.assertEquals("Algorithm Name can be null/empty.",mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void givenValidInput_NullName_whenAdded_shouldReturnValidResponse(){
        try {
            this.inputValue=new ArrayList();
            this.inputValue.add(1);
            this.inputValue.add(2);
            this.inputValue.add(3);
            this.inputValue.add(4);
            this.gson=new Gson();
            this.algorithmDTO=new AlgorithmDTO(null,this.inputValue);
            MvcResult mvcResult=this.mockMvc.perform(post("/algo")
                    .contentType(MediaType.APPLICATION_JSON_VALUE)
                    .content(new Gson().toJson(this.algorithmDTO))).andReturn();
            Assertions.assertEquals(200,mvcResult.getResponse().getStatus());
            Assertions.assertEquals("Algorithm Name can be null/empty.",mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
