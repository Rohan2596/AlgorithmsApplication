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
    public ArrayList inputValue;


    @Test
    public void givenValidAlgorithmDto_whenAdded_shouldReturnVaildResponse() {
        this.inputValue = new ArrayList();
        this.inputValue.add(1);
        this.inputValue.add(2);
        this.inputValue.add(3);
        this.inputValue.add(4);
        this.algorithmDTO = new AlgorithmDTO("BubbleSort", this.inputValue);

        Mockito.when(this.algorithmSeviceImplentation.sortedList(this.algorithmDTO)).thenReturn("Sorted List Of Values.");
        Assertions.assertEquals("Sorted List Of Values.", this.algorithmSeviceImplentation.sortedList(this.algorithmDTO));

    }
}
