package com.saptalabz.algorithm.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootTest
@AutoConfigureMockMvc
public class BubbleSortTest<E> {

    private BubbleSort bubbleSort;
    private int input[];

    @BeforeEach
    void setUp() {
        this.input =new int[]{23, 43, 23, 34, 54, 45, 445, 12};
        this.bubbleSort = new BubbleSort(this.input);

    }

    @Test
    public void givenValidList_Integer_whenSorted_ShouldReturnValidResponse() {
        this.bubbleSort.sortedList();
    }
}
