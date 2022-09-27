package com.aditya.Questions;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(search(arr,4,0,arr.length-1));
    }
    static int search(int[] nums, int target ,int start, int end) {
        if (start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if (nums[mid] == target){
            return mid;
        }
        if (nums[mid]> target){
            return search(nums,target,start,mid-1);
        }else{
            return search(nums,target,mid+1,end);
        }
    }
}
