package com.aditya;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length){
            if (nums[i] != i+1){
            int correctindex = nums[i]-1;
            if (nums[correctindex] != nums[i]){
                swap(nums,i,correctindex);
            }else{
                return nums[i];
            }
        }
           else{
               i++;
            }
    }
        return -1;
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}