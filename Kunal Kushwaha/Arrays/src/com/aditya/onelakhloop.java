package com.aditya;

import java.util.Scanner;

public class onelakhloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
        }
        int num = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                System.out.println(true);
                break;
            }
        }

    }
}
