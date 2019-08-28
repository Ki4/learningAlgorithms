package com.gmail.sergeykichukki4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {
    int [] testArray = {1, 9, 3, 2, 2, 15};
    SelectionSort obj = new SelectionSort();
    @Test
    public void selectionSort() {
        obj.selectionSort(testArray);
        int [] actual = testArray;
        int [] expected = {1, 2, 2, 3, 9, 15};

        Assert.assertArrayEquals(expected, actual);
    }
}