package com.aditya;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correctindex = nums[i]-1;
            if (nums[correctindex] != i){
                swap(nums,i,correctindex);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}