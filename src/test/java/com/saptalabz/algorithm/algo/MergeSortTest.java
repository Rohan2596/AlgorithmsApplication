package com.saptalabz.algorithm.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class MergeSortTest {

    private MergeSort mergeSort;
    private int input[];

    @BeforeEach
    void setUp() {
        this.input =new int[]{21, 43, 23, 34, 54, 45, 445, 12};
        this.mergeSort = new MergeSort(this.input);

    }

    @Test
    public void givenValidList_Integer_whenSorted_ShouldReturnValidResponse() {
        this.mergeSort.sortedList();
    }

}
