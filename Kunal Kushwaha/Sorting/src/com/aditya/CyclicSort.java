package com.aditya;

public class CyclicSort {
    public static void main(String[] args) {

    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void cycleSort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correctindex = arr[i]-1;
            if (arr[correctindex] != i){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
    }
}
