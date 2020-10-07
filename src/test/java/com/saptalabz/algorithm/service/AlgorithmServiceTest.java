package com.saptalabz.algorithm.service;

import com.saptalabz.algorithm.dto.AlgorithmDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
@AutoConfigureMockMvc
public class AlgorithmServiceTest {

    @Mock
    AlgorithmSeviceImplentation algorithmSeviceImplentation;

    AlgorithmDTO algorithmDTO;
    int input[]=new int[8];



    @Test
    public void givenValidAlgorithmDto_whenAdded_shouldReturnVaildResponse() {
        this.input= new int[]{23, 43, 23, 34, 54, 45, 445, 12};

        this.algorithmDTO = new AlgorithmDTO("BubbleSort", this.input);

        Mockito.when(this.algorithmSeviceImplentation.sortedList(this.algorithmDTO)).thenReturn("Sorted List Of Values.");
        Assertions.assertEquals("Sorted List Of Values.", this.algorithmSeviceImplentation.sortedList(this.algorithmDTO));

    }
}
