package com.gautam.algo.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void quickSortImpl(int[] arr, int low, int high) {
        if(low < high) {
            //int pi = partitionIndexLast(arr, low, high);
            //int pi = partitionIndexFirst(arr, low, high);
            // int pi = partitionIndexMiddle(arr, low, high);
            int pi = partitionFirst1(arr, low, high);
            quickSortImpl(arr, low, pi-1);
            quickSortImpl(arr, pi+1, high);
        }
    }
    public static void random(int[] arr, int low, int high) {
        Random random = new Random();
        int pi = random.nextInt(high-low)+low;

        int temp = arr[pi];
        arr[pi] = arr[high];
        arr[high] = temp;
    }

   // When the last index is considered as Pivot element
    public static int partitionIndexLast(int[] arr, int low, int high) {
        int i = low-1;
        // random(arr, low, high); // Use when pivot element needs to be selected as random number
        int pi = arr[high];
        for(int j = low; j < high; j++) {
            if(arr[j] < pi) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, (i+1), high);
        return (i+1);
    }

    // When the first element is selected as Pivot index
    public static int partitionIndexFirst(int[] arr, int low, int high) {
        int pi = arr[low];
        int i = high;
        for(int j = high; j >= low; j--) {
            if(arr[j] > pi) {
                swap(arr, i, j);
                i--;
            }
        }
        swap(arr, i, low);
        return i;
    }

    public static int partitionFirst1(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        for(int j = low+1; j <= high; j++) {
            if(arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i-1, low);
        return i-1;
    }

    public static int partitionIndexMiddle(int[] arr, int low, int high) {
        int pi = low + (high-low) / 2;
        int pivot = arr[pi];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] < pivot)
                i++;

            while(i <= j && arr[j] > pivot)
                j--;

            if(i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return j;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        //int[] arr = {10,30, 40, 90, 80};
        int[] arr = {10, 30, 20, 50, 40, 90, 80, 70, 60};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        quickSortImpl(arr, 0, arr.length-1);
        System.out.println(" Sorted Array: "+Arrays.toString(arr));
    }
}
