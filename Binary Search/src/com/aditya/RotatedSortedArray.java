package com.aditya;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        System.out.println(findPivot(arr));
        System.out.println(ans(arr, 5));
    }
    static int ans(int[] arr, int target){
        if (findPivot(arr)==-1){
            return binarySearch(arr, target, 0, arr.length-1);
        } if (target<arr[0]){
            return binarySearch(arr,target, findPivot(arr)+1,arr.length-1);
        }if (arr[findPivot(arr)]==target){
            return findPivot(arr);
        }
        if (target>=arr[0]){
            return binarySearch(arr, target, 0, findPivot(arr)-1);
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (start < mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if (end > mid &&arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if (arr[start]>arr[mid]){
                end = mid-1;
            }else if (end > mid && arr[mid] < arr[mid] + 1){
                start = mid + 1;
            }else if (start > mid && arr[mid-1]> arr[mid]){
                return mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}