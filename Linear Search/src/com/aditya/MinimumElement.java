package com.aditya;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int min = arr[0];
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}
