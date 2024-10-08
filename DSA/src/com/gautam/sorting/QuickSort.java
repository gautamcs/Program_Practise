package com.gautam.sorting;

import java.util.Arrays;

public class QuickSort {

    public static int pivotIndex(int[] arr, int s, int e) {
//         s = 0;
//         e = arr.length -1;
        int i = s-1;
        int pi = arr[e]; // Assume that last element would be PIVOT

        for(int j = s; j < e; j++) {
            if(arr[j] < pi ) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       // System.out.println(" Temp Array: "+Arrays.toString(arr));
        i++;
        int temp = arr[i];
        arr[i] = pi;
        arr[e] = temp;

        System.out.println(" Temp Array: "+Arrays.toString(arr));
        return i;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pi = pivotIndex(arr, start, end);
            quickSort(arr, start, pi-1);
            quickSort(arr, pi+1, end);
        }
    }
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3,9,6,0,8};

        System.out.println(" Original Array: " + Arrays.toString(arr));
        int len = arr.length;

//        int index = QuickSort.pivotIndex(arr, 0, len-1);
//        System.out.println(" Pivot Index: "+index);

        QuickSort.quickSort(arr, 0, len-1);
        System.out.println(" Sorted Array: " + Arrays.toString(arr));
    }
}
