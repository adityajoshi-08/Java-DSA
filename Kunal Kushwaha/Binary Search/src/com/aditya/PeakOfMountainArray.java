package com.aditya;

public class PeakOfMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,10};
        System.out.println(arr[binarySearch(arr)]+" element at "+binarySearch(arr)+" index");
    }
    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        if (arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (mid <= arr.length-1){
                if (arr[mid] > arr[mid+1]) {
                    if (arr[mid]>arr[mid-1]){
                        return mid;
                    }else if(arr[mid]<arr[mid-1]){
                        end = mid-1;
                    }
                } else if (arr[mid] < arr[mid+1]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
