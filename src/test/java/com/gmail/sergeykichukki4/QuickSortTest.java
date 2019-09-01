package com.gmail.sergeykichukki4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    QuickSort obQuickSort = new QuickSort();
    int arr[] = {10, 7, 8, 9, 1, 5, 123, 4, 19, 27};
    final int ZERO = 0;

    @Test
    public void sort() {
        int n = arr.length;

        obQuickSort.sort(arr, ZERO, n - 1);

        int actual[]= arr;
        int expected[] = {1, 4, 5, 7, 8, 9, 10, 19, 27, 123};
        Assert.assertArrayEquals(expected, actual);
    }
}