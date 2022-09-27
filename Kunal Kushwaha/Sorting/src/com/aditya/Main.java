package com.aditya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {4,3,5,2,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
//            int lastindex = arr.length - i- 1;
            int max = getMaxIndex(arr, 0,arr.length - i- 1 );
            swap(arr, max, arr.length - i- 1);
        }
    }
    static int getMaxIndex(int[] arr , int start, int end){
        int max = start;
        for (int i = 0; i <= end ; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }



    static void InsertionSort(int[] arr) {
        /*select an element and keep on sorting the
        * left part of the array and insert the next element
        * at it's correct position*/
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] >= arr[j - 1]) {
                    break;
                } else if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j-1);
                    swap = true;

                }
            }
            if (!swap) {
                break;
            }
        }
        return arr;
    }
}
