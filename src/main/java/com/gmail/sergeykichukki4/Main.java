package com.gmail.sergeykichukki4;

public class Main {
    public static void main(String[] args) {
        int smallArray[];
        int bigArray[];
        int numberForSmallArray;
        int numberForBigArray;

        ArrayCreating operatedObject = new ArrayCreating();

        System.out.println("Enter the size of small array:");
        numberForSmallArray = operatedObject.inputIntValue();
        System.out.println("Enter the size of big array:");
        numberForBigArray = operatedObject.inputIntValue();

        smallArray = new int[numberForSmallArray];
        bigArray = new int[numberForBigArray];

        smallArray = operatedObject.arrayFilling(smallArray);
        bigArray = operatedObject.arrayFilling(bigArray);

        operatedObject.printArray(smallArray);
        System.out.println();
        operatedObject.printArray(bigArray);
        System.out.println();

        BubbleSort ob = new BubbleSort();

        ob.bubbleSort(smallArray);

        System.out.println("Sorted small array: ");
        operatedObject.printArray(smallArray);
        System.out.println();

        System.out.println("Sorted big array: ");
        ob.bubbleSort(bigArray);
        operatedObject.printArray(bigArray);
    }
}
