package com.saptalabz.algorithm.controller;

import com.saptalabz.algorithm.dto.AlgorithmDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AlgorithmController {

    @PostMapping("/algo")
    public String inputValue(@RequestBody @Valid AlgorithmDTO algorithmDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return bindingResult.getAllErrors().get(0).getDefaultMessage();
        }
        return algorithmDTO.name;
    }
}
