package com.gautam.algo.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSortImpl1(int[] arr, int n) {
        // Starting from 1, Bcz 1st element is left as it is,
        // Comparison will be started from 1st index onwards
        for(int i = 1; i < n; i++) {
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key) { // Increasing Order
            //while(j >= 0 && arr[j] < key) { // Decreasing Order
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,8,5,4,9,0,7,11};

        System.out.println(" Original Array: "+ Arrays.toString(arr));

        insertionSortImpl1(arr, arr.length);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
