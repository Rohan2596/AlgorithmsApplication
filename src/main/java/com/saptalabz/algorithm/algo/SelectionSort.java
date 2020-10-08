package com.saptalabz.algorithm.algo;

public class SelectionSort {

    private int input[];

    public SelectionSort(int[] input) {
        this.input = input;
    }

    public int[] sortedList() {
        int size = this.input.length;

        System.out.println(size);

        /*
        * Step 1
        * Getting the min =array[0]
        * Step 2
        * consider the last element to be sorted we iterate i till size-1
        *
        * Step 3
        * for Second Loop start =min+1 end =size int
        * */
        for (int i = 0; i < size-1; i++) {
            int min = i;
            for (int j = min + 1; j < size; j++) {
                if (this.input[min] > this.input[j]) {
                    min = j;
                }
            }
            int temp = this.input[i];
            this.input[i] = this.input[min];
            this.input[min] = temp;


        }
        System.out.println();
        for (int value: input) {

            System.out.print(value+",");
        }

        return this.input;
    }
}
