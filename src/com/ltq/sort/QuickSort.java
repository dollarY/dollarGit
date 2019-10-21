package com.ltq.sort;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr,int left,int right) {
        int pivot = arr[left];//切分值
        int l = left ;//左指针
        int r = right;//右指针
        while (l < r) {

            while (l < r && arr[r] > pivot){
                r--;
            }

            while (l < r && arr[l] <= pivot) {
                l++;
            }


            if(l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }

        }
        int temp = arr[l];
        arr[l] = pivot;
        arr[left] = temp;
        return l;

    }

    public static void quickSort(int[] arr,int left,int right) {
        if(left >= right) return;
        int pivot = partition(arr,left,right);
        quickSort(arr,left,pivot - 1);
        quickSort(arr,pivot + 1,right);
    }
    public static void main(String[] args) {
        int[] arr = {3,2};
        int[] a = new int[30];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 50);
        }

        quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
}
