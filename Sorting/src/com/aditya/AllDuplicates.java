package com.aditya;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5};
        System.out.println(findAllDuplicate(arr));;
    }
    static List<Integer> findAllDuplicate(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i<nums.length){
            int correctindex = nums[i]-1;
            if (nums[correctindex] != i){
                swap(nums,i,correctindex);
            }else{
                i++;
            }
        }
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
