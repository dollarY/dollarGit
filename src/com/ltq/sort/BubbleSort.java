package com.ltq.sort;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {12,34,55,92,23,45,64,33,99,10,20};
        int temp;
        for (int i = 0; i < arr.length -1; i++) {
            boolean flag = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!flag) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
