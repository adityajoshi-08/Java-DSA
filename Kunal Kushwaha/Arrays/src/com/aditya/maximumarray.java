package com.aditya;

import java.util.Arrays;
import java.util.Scanner;

public class maximumarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arry = new int[5];
        for (int i = 0; i < arry.length; i++) {
            int num = in.nextInt();
            arry[i] = num;
        }
//        System.out.println(Arrays.toString(arry));
        System.out.println(max(arry));

    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
