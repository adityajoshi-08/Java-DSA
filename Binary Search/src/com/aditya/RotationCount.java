package com.aditya;

public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {5,61, 2, 3, 4};
        if (findPivot(arr) == -1) {
            System.out.println("0 times");
        } else {
            System.out.println(findPivot(arr) + 1 +" times");
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[0] > arr[mid]) {
                end = mid - 1;
            }
            if (end > mid && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            if (start < mid && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}

