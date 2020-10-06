package com.saptalabz.algorithm.algo;

import com.google.gson.internal.$Gson$Preconditions;

import java.util.ArrayList;

public class BubbleSort<E> {

    private ArrayList<E> inputList;

    public BubbleSort(ArrayList<E> inputList) {
        this.inputList = inputList;
    }

    public ArrayList<E> sortedList() {
        int size=this.inputList.size();
        System.out.println(size);
        return this.inputList;
    }
}
