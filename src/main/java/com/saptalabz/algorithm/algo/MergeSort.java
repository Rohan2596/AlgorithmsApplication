package com.saptalabz.algorithm.algo;

public class MergeSort {

    private int input[];

    public MergeSort(int[] input) {
        this.input = input;
    }

    public int[] sortedList() {

        return this.input;
    }

    public void merge(int[] A, int[] B) {
        int size_a = A.length;
        int size_b = B.length;
        int[] C = new int[size_a + size_b];
        int i = 1, j = 1, k = 1;

        //Comparing for two list with each other.
        while (i <= size_a && j < size_b) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[i++];
            }
        }
        //Merging remaining list
        for (; i <= size_a; i++) {

            C[k++] = A[i];
        }
        for (; j <= size_b; j++) {

            C[k++] = B[j];
        }
    }
}
