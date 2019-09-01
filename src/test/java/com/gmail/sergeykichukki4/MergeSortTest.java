package com.gmail.sergeykichukki4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    int arr[] = {10, 7, 8, 9, 1, 5, 123, 4, 19, 27};
    final int ZERO = 0;

    @Test
    public void mergeSort() {
        /*MergeSort mergeSort = new MergeSort(arr);
        mergeSort.mergeSort(ZERO, arr.length - 1);

        int actual[]= arr;
        int expected[] = {1, 4, 5, 7, 8, 9, 10, 19, 27, 123};
        Assert.assertArrayEquals(expected, actual);*/

        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
}