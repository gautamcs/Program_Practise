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

    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end-start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] mergedArr = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j])
                mergedArr[k++] = arr[i++];
            if(arr[i] > arr[j])
                mergedArr[k++] = arr[j++];
        }

        while(i <= mid) {
            mergedArr[k++] = arr[i++];
        }
        while (j <= end) {
            mergedArr[k++] = arr[j++];
        }

        for(int t = 0; t < mergedArr.length; t++) {
            arr[t+start] = mergedArr[t];
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,7,1,2};

        System.out.println(" Original Array: "+ Arrays.toString(arr));
        //insertionSort(arr, arr.length);
        //selectionSort(arr, arr.length);
        mergeSort(arr, 0, arr.length-1);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
