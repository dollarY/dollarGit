package com.ltq.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        //int[] arr = new int[]{5, 1, 7, 8, 3, 10, 2, 4, 9, 12, 19};
        int[] arr = new int[] {12,34,55,92,23,45,64,33,99,10,20};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //没进行优化的插入排序
    public static void insertSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            //int insertValue = arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j+1] < arr[j]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
    }
}
