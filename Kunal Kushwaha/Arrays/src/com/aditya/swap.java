package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int[] arry = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arry.length; i++) {
            int num = in.nextInt();
        }
    }

    static void swap(int[] arr, int index1, int index2) {
            int temp = arr[index1];
            arr[index1]= arr[index2];
            arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }
}

