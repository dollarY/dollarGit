package com.ltq.sort;

import java.util.*;

public class Test {

    public static boolean reverseString(int[]  nums) {
        Set set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,1};
       // System.out.println(arr);
        System.out.println(reverseString(nums));
    }



}
