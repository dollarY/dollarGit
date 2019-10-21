package com.ltq.sort;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
//选择排序
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] {12,34,55,92,23,45,64,33,99,10,20};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
}
