package com.gmail.sergeykichukki4;

public class BubbleSort {
    public BubbleSort() {
    }

    public void bubbleSort(int[] operatedArray) {
        int swap;
        for (int i = 0; i < operatedArray.length - 1; i++)
            for (int j = 0; j < operatedArray.length - 1 - i; j++) {
                if (operatedArray[j] > operatedArray[j + 1]) {
                    swap = operatedArray[j];
                    operatedArray[j] = operatedArray[j + 1];
                    operatedArray[j + 1] = swap;
                }
            }
    }
}
