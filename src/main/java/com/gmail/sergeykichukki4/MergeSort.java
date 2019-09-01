package com.gmail.sergeykichukki4;

public class MergeSort {
    /*private int[] nums;
    private int[] tempArray;

    public MergeSort(int[] nums) {
        this.nums = nums;
        tempArray = new int[nums.length];
    }

    public void mergeSort(int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int middle = (lowIndex + highIndex) / 2;

        mergeSort(lowIndex, middle);
        mergeSort(middle + 1, highIndex);
        merge(lowIndex, middle, highIndex);
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = nums[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while ((i <= middle) && (j <= high)) {
            if (tempArray[i] <= tempArray[j]) {
                nums[k] = tempArray[i];
                i++;
            } else {
                nums[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            nums[k] = tempArray[i];
            k++;
            i++;
        }

        while (j <= high) {
            nums[k] = tempArray[j];
            k++;
        }
    }*/

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
