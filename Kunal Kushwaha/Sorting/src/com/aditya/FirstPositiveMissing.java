package com.aditya;

class FirstPositiveMissing {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correctindex = nums[i];
            if (nums[i]>0 && nums[i] < nums.length && nums[correctindex] != nums[i]){
                swap(nums,i,correctindex);
            }else{
                i++;

            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1 ){
                return index+1;
            }
        }
        return nums.length + 1 ;
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}