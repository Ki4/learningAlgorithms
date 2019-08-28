package com.gmail.sergeykichukki4;

public class SelectionSort {
    public SelectionSort() {
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
                int swap = array[minIndex];
                array[minIndex] = array[i];
                array[i] = swap;
        }
    }
}
