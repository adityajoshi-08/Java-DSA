package com.aditya;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {0,16,18,19,20,22,25,27,29,31,34,38,39,40,46,59,60,65,67,69,81,82};
        System.out.println(ans(arr,29));
    }
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
           int newStart = end + 1;
           end += (end-start + 1)*2;
           start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start,int end) {
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
