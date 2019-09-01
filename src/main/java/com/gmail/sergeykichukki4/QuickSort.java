package com.gmail.sergeykichukki4;

public class QuickSort   {
    public QuickSort() {
    }

    public void sort(int [] arr, int lowIndex, int highIndex){
        if(lowIndex < highIndex){
            int pivot = partition(arr, lowIndex, highIndex);

            sort(arr, lowIndex, pivot -1 );
            sort(arr, pivot + 1, highIndex );
        }
    }

    public int partition(int arr[], int lowIndex, int highIndex){
        int pivot = arr[highIndex];
        int i = (lowIndex - 1);
        for(int j = lowIndex; j < highIndex; j++){
            if(arr[j] < pivot){
                i++;

                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int swap = arr[i+1];
        arr[i+1] = arr[highIndex];
        arr[highIndex] = swap;

        return i+1;
    }
}
