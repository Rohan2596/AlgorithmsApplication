package com.saptalabz.algorithm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmController {

    @PostMapping("/algo")
    public String inputValue(){
        return "Input...";
    }
}
