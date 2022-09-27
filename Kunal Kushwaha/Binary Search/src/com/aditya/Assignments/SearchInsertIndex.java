package com.aditya.Assignments;

import java.util.Scanner;

public class SearchInsertIndex {
    public static void main(String[] args) {
        int[] arr = {1};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(searchInsert(arr, target));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        if (target < nums[0]){
            return 0;
        }
        if (target > nums[nums.length - 1]){
            return nums.length;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (target < nums[mid]) {
                if (mid > start && target > nums[mid - 1]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else if (target > nums[mid]) {
                if (mid < end && target < nums[mid+1]){
                    return mid+1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return end;
    }
}
