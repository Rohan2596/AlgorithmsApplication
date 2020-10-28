package com.saptalabz.algorithm.algo;

public class MergeSort {

    private int input[];

    public MergeSort(int[] input) {
        this.input = input;
    }

    public int[] sortedList() {
           mergeSort(this.input,0,input.length-1);

        for (int value : this.input) {
            System.out.print(value + " ");

        }
        System.out.println("");

        return this.input;
    }

    public void mergeSort(int input[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(input,low,mid);
            mergeSort(input,mid+1,high);
            merge(input,low,mid,high);
        }
    }

    public void merge(int[] input,int low,int mid,int high) {


        int n1 = mid - low + 1;
        int n2 = high - mid;

        //Creating two sub arrays left and right
        int left[] = new int[n1];
        int right[] = new int[n2];


        //Injecting left and right array
        for (int i = 0; i < n1; i++)
            left[i] = input[low + i];
        for (int j = 0; j < n2; j++)
            right[j] = input[mid + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            input[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            input[k] = right[j];
            j++;
            k++;
        }
    }
}
