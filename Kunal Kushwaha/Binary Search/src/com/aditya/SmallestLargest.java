package com.aditya;

public class SmallestLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5,5,5,6,7};
        System.out.println(searchRange(arr,5));
    }
    static int[] searchRange(int[] nums, int target) {
       int[] arr ={-1,-1};
       arr[0] = search(nums,target,true);
       arr[1] = search(nums,target,false);
        return arr;

    }
    static int search(int[] arr, int target, boolean beforesearch){
        int ans  = -1;
        int start = 0 ;
        int end = arr.length-1;

        while(end>=start){
            int mid = start + (end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            }else if (target<arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if (beforesearch){
                    end = mid-1;

                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
