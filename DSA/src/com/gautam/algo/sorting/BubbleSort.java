package com.gautam.algo.sorting;

import java.util.Arrays;

/*  Bubble Sort:
*  Time Complexity: O(n)2
*  Requires (n-1) pass
*  Each element is compared with the next element, If it's not in order, then swap
* Continue this process,
* In each pass, Max element will be at the top
* */
public class BubbleSort {

    // all the comparisons are made even if the array is already sorted.
    // Time Complexity: O(n)2
    // Space Complexity: O(1)
    public static void bubbleSortWay1(int arr[], int len) {
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len - i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j]; // Space complexity: O(1)
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Time Complexity: O(n)2
    // Space Complexity: O(2)
    public static void bubbleSortWay2(int arr[], int len) {
        for(int i = 0; i < len; i++) {
            boolean swap = false; // Space complexity: O(1)
            for(int j = 0; j < len - i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j]; // Space complexity: O(1) For Swapping
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,8,5,4,9,0,7,11};

        System.out.println(" Original Array: "+ Arrays.toString(arr));
        bubbleSortWay2(arr, arr.length);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
