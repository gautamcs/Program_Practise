package com.gautam.algo.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6,7,11,15,21,32,56};
        int item = 56;
        System.out.println(" Original Array Data: "+ Arrays.toString(arr));

        //int index = binarySearchNormal(arr, 0, arr.length, item);
        int index = binarySearchRecursive(arr, 0, arr.length, item);
        System.out.println(" Index : "+index);
    }

    public static int binarySearchNormal(int[] arr, int low, int high, int item) {

        while(low < high) {
            int mid = low + (high - low) / 2;
            if (item == arr[mid]) {
                System.out.println(" Item found at : "+mid);
                return mid;
            } else if (item <= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(" Item Not Found! ");
        return -1;
    }


    public static int binarySearchRecursive(int[] arr, int low, int high, int item) {

        if(low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(item == arr[mid]) {
            return mid;
        } else if(item < arr[mid]) {
            return binarySearchRecursive(arr, low, mid-1, item);
        } else {
            return binarySearchRecursive(arr, mid+1, high, item);
        }
    }
}
