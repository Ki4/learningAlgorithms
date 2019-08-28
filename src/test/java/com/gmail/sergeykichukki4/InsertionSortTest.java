package com.gmail.sergeykichukki4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    int [] testArray = {1, 9, 3, 2, 2, 15};
    InsertionSort operatedOb = new InsertionSort();
    @Test
    public void insertionSort() {
        operatedOb.insertionSort(testArray);
        int [] actual = testArray;
        int [] expected = {1, 2, 2, 3, 9, 15};

        Assert.assertArrayEquals(expected, actual);
    }
}