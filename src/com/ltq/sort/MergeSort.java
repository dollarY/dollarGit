package com.ltq.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.SortedMap;

//自顶向下的归并排序（递归调用）
public class MergeSort {
    private static int[] temp;//临时数组
    public static void sort(int[] arr,int left,int right) {
        if(left >= right)
            return;
        int mid = left +(right - left) / 2;
        sort(arr,left,mid);
        sort(arr,mid + 1,right);
        merge2(arr,left,right);
    }


    //归并方法
    public static void merge(int[] arr,int left,int mid,int right) {
       int i = left;
       int j = mid+1;
        for (int k = left; k <= right; k++) {
            temp[k] = arr[k];
        }
        for (int k = left; k <=right; k++) {
            if(i > mid) arr[k] = temp[j++];
            else if(j > right) arr[k] = temp[i++];
            else if(temp[j] < temp[i]) arr[k] = temp[j++];
            else arr[k] = temp[i++];
        }
    }

    public static void merge2(int[] arr,int left,int right) {
        int mid = (left + right) / 2;
        int i = left;
        int j = mid+1;
        for (int k = left; k <= right; k++) {
            temp[k] = arr[k];
        }
        for (int k = left; k <=right; k++) {
            if(i > mid) arr[k] = temp[j++];
            else if(j > right) arr[k] = temp[i++];
            else if(temp[j] < temp[i]) arr[k] = temp[j++];
            else arr[k] = temp[i++];
        }
    }



    public static void main(String[] args) {
       // int[] arr = {5,1,7,8,3,10,2,4,9,12,19};
        int[] a = new int[30];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 500);
        }
        temp = new int[a.length];
        sort(a,0,a.length -1);
        System.out.println(Arrays.toString(a));

    }
}
