package com.datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {
    //find the minimum element and keep it at 1st position. and keep going till the array is sorted.
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 50, 40, 90, 20, 10};
        for (int i = 0; i < arr.length - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < arr.length; j++) {
                //To find the minimum item
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
                //swap
                int temp = arr[min_ind];
                arr[min_ind] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
