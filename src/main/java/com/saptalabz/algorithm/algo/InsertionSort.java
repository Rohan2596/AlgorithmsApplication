package com.saptalabz.algorithm.algo;

public class InsertionSort {
    private int[] input;

    public InsertionSort(int[] input) {

        this.input = input;
    }

    //technique of shuffle Cards where first elements is sorted.

    /**
     * While Shuffling card in our  hand we consider that the first card is
     * sorted and comparing second card with previous card and the shuffling them accordingly
     */
    public int[] sortedList() {

        int size = this.input.length;
        for (int i = 1; i < size; i++) {
            //taking key as card 2
            int key = this.input[i];
            int j = i - 1;
            //checking previous cards with card the current card
            while (j >= 0 && key < this.input[j]) {
                this.input[j + 1] = this.input[j];
                j = j - 1;
            }
            //finally shuffling them out.
            this.input[j + 1] = key;

        }

        for (int value : this.input) {
            System.out.print(value + " ");

        }
        System.out.println("");

        return this.input;
    }
}
