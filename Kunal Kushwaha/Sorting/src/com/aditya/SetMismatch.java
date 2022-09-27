package com.aditya;

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correctindex = nums[i]+1;
            if (nums[i] < nums.length && nums[correctindex] != nums[i]){
                swap(nums,i,correctindex);
            }else{
                i++;

            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}