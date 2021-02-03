package com.company;

import java.util.Arrays;

public class RotateArray {
    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;

        reverse(nums, 0 , nums.length-1);
//        reverse(nums, 0 , nums.length-1);
//        reverse(nums, 0 , nums.length-1);
         reverse(nums, 0, k-1);
         reverse(nums, k, nums.length-1);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1 ; i++) {
            if (nums[i] == nums [i+1]) return true;
        }
        return false;
    }
}
