package com.datastructure.sorting;

import java.util.Arrays;

public class BubbleSort {
//    // time and space
//    assignment 1 : put it in IDE and write test cases or test it in main function

    //[20,10,30,50,40,90,20,10]
    //passes - highest element reaches to its position in first pass..

    public void bubbleSort(int[] arr) {
//        int[] arr = {20,10,30,50,40,90,20,10};
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                swapped = true;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Swapped : " + swapped);

    }

    public static void main(String[] args) {

        int[] arr = {20, 10, 30, 50, 40, 90, 20, 10};
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                swapped = true;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Swapped : " + swapped);

    }
}
