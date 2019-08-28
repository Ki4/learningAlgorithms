package com.gmail.sergeykichukki4;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    int[] arrTest = {1, 2, 31, 17, 2, 7, 9, 44, 59, 93, 1, 4, 2};
    BubbleSort operatedObejct = new BubbleSort();

    @Test
    public void bubbleSort() {
        operatedObejct.bubbleSort(arrTest);
        int [] actual = arrTest;
        int [] expected = {1, 1, 2, 2, 2, 4, 7, 9, 17, 31, 44, 59, 93};

        Assert.assertArrayEquals(expected, actual);
    }
}