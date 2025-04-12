package com.gautam.algo.sorting;

import java.util.Arrays;

/*
*   Selection Sort :
*   Time Complexity: O(n)2
*   Each pass select the smallest element and place it at exact position
*   First we find the smallest element and put it at the 0'th index, then find the 2nd smallest element
*   and put it at 1st index, and so on ...
* */
public class SelectionSort {

    public static void selectionSortWay1(int arr[], int len) {
        for(int i = 0; i < len; i++) {
            int min = i;
            for(int j = i; j < len; j++) {
                // if(arr[min] > arr[j]) { // Increasing Order
                if(arr[min] < arr[j]) { // Decreasing Order
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,8,5,4,9,0,7,11};

        System.out.println(" Original Array: "+ Arrays.toString(arr));

        selectionSortWay1(arr, arr.length);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));

    }
}
