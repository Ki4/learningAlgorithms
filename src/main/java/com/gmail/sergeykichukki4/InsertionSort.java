package com.gmail.sergeykichukki4;

public class InsertionSort {
    public InsertionSort() {
    }

    public void insertionSort(int [] inputArray){
        for(int i = 1; i < inputArray.length; i++){
            int key = inputArray[i];
            int j = i - 1;
            while(j >= 0 && inputArray[j] > key){
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = key;
        }
    }
}
