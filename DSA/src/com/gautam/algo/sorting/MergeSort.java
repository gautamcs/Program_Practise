package com.gautam.algo.sorting;

import java.util.Arrays;

public class MergeSort {
    // This method will be called: (2n-1) times , Where n: Number of Elements
    public static void sort(int[] arr, int s, int e) {
        if(s < e) {
            int m = s + (e-s) / 2;
            sort(arr, s, m);
            sort(arr, m+1, e);
            merge(arr, s, m, e);
        }
    }

    // This method will be called: (n-1) times
        public static void merge(int[] arr, int s, int m, int e) {
        int[] mArr = new int[e-s+1];
        int x1 = s;
        int x2 = m+1;
        int k = 0;

        while(x1 <= m && x2 <= e) {
            if(arr[x1] <= arr[x2]) {
                mArr[k++] = arr[x1++];
            } else {
                mArr[k++] = arr[x2++];
            }
        }

        while(x1 <= m) {
            mArr[k++] = arr[x1++];
        }
        while (x2 <= e) {
            mArr[k++] = arr[x2++];
        }

//        for(int i = 0, j = s; i < mArr.length; i++, j++) {
//            arr[j] = mArr[i];
//        }
        for(int t = 0; t < mArr.length; t++) {
            arr[s+t] = mArr[t];
        }
    }
    public static void main(String[] args) {
       // int[] arr = {2,1,5,8,5,4,9,0,7,11};
        int[] arr = {2,1,0};//,8,5,-1};//,5,4,9,0,7,11};

        System.out.println(" Original Array: "+ Arrays.toString(arr));

        sort(arr, 0, arr.length-1);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
