package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //old way of output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //enhanced for loop
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        // or Arrays.toString function can be used
        System.out.println(Arrays.toString(arr));
    }
}
