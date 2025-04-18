package com.gautam.algo.sorting;

import java.util.Arrays;

public class Sorting {

    public static void insertionSort(int[] arr, int n) {
        for(int i = 1; i < n; i++) {
            int j = i-1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void selectionSort(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i; j < n; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,7,1,2};

        System.out.println(" Original Array: "+ Arrays.toString(arr));
//        insertionSort(arr, arr.length);
        selectionSort(arr, arr.length);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
