package com.datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {
//consider 1st half as sorted, in mid we have key(which we will try to insert in sorted half, 2nd half is unsorted.

    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 50, 40, 90, 20, 10};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));

    }
}
