package com.saptalabz.algorithm.controller;

import com.saptalabz.algorithm.dto.AlgorithmDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmController {

    @PostMapping("/algo")
    public String inputValue(@RequestBody AlgorithmDTO algorithmDTO){
        System.out.println("Input...."+algorithmDTO.name +" dsfds "+algorithmDTO.inputValue);
        return algorithmDTO.name;
    }
}
