package com.aditya.Questions;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        System.out.println(max(arr,arr.length));
    }
    static int min(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }
        return(Math.min(arr[n-1], min(arr,n-1)));

    }

    static int max(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }
        return(Math.max(arr[n-1], max(arr,n-1)));

    }
}
