package com.saptalabz.algorithm.algo;


import java.util.ArrayList;

/*
 * @Author ROHAN KADAM
 * @DATE 06 October 2020
 * @Description
 * Bubble Sort is sorting algorithm that used the technique of adjacency techniques
 * We used i for rows and j for columns
 * Exchange of columns values takes places by comparing current hed and next head.
 *
 * */


public class BubbleSort {

    private int input[];

    public BubbleSort(int  input[]) {

        this.input = input;
    }

    public int[] sortedList() {
        int size = this.input.length;
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size-i-1 ; j++) {
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }

            }
        }

        for (int value: input) {
            System.out.print(value+",");
        }

        return this.input;
    }
}
