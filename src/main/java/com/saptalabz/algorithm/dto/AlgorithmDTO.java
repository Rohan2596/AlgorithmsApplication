package com.saptalabz.algorithm.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
public class AlgorithmDTO {

    @NotNull(message = "Algorithm Name can be null/empty.")
    @NotEmpty(message = "Algorithm Name can be null/empty.")
    public String name;
    public ArrayList inputValue;

}
