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
    private ArrayList<E> inputList;
    private ArrayList<Integer> integerArrayList;

    @BeforeEach
    void setUp() {
        this.inputList = new ArrayList<>();
        this.integerArrayList = new ArrayList<Integer>();
        this.integerArrayList.add(7);
        this.integerArrayList.add(5);
        this.integerArrayList.add(8);
        this.integerArrayList.add(0);
        this.inputList.addAll((Collection<? extends E>) this.integerArrayList);
        this.bubbleSort = new BubbleSort(this.inputList);

    }

    @Test
    public void givenValidList_Integer_whenSorted_ShouldReturnValidResponse() {
        this.bubbleSort.sortedList();
    }
}
