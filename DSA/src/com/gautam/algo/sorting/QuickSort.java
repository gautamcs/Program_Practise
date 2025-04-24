package com.gautam.algo.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void quickSortImpl(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
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

    public static int partition(int[] arr, int low, int high) {
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

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,30, 40, 90, 80};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        quickSortImpl(arr, 0, arr.length-1);
        System.out.println(" Sorted Array: "+Arrays.toString(arr));
    }
}
