package com.saptalabz.algorithm.algo;


//quick Sort used Divide conquer and combine
public class QuickSort {

    private int input[];

    public QuickSort(int[] input) {
        this.input=input;
    }

    public int[] sortedList() {
        quickSort(this.input,0,this.input.length-1);
        for (int value : this.input) {
            System.out.print(value + " ");

        }
        System.out.println("");
        return this.input;
    }


    public  void quickSort(int input[],int low,int high){
        if(low<high){
            int pi=partition(input,low,high);
            quickSort(input,low,pi-1);
            quickSort(input,pi+1,high);
        }

    }

    private int partition(int[] input, int low, int high) {
        int pivot =input[high];
        int i =low -1;
        for (int j = low; j <high ; j++) {
            if(input[j]<=pivot){
                i++;
                int temp=input[i];
                input[i]=input[j];
                input[j]=temp;
            }
        }
        int temp=input[i+1];
        input[i+1]=input[high];
        input[high]=temp;
        return i+1;
    }
}
