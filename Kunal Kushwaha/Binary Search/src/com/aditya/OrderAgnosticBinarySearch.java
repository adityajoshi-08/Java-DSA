package com.aditya;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        Scanner in = new Scanner(System.in);
        System.out.print("Which element do you want to find? ");
        int target = in.nextInt();
        System.out.println("Element found at " + orderAgnosticBinarySearch(arr, target) + " index");
    }

    //return the index
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        if (arr[0] < arr[arr.length - 1]) {
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

        }
        else if(arr[0]>arr[arr.length-1]){
            while (end >= start) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
