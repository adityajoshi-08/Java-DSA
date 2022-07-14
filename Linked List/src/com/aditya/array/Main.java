package com.aditya.array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
//            int j = in.nextInt();
            Integer x = in.nextInt();

            arr[i] = System.identityHashCode(x);
        }
        for (int i = 1; i < arr.length; i++) {
//            System.out.println(arr[i] +"-->"+System.identityHashCode(arr[i]) );
            System.out.println(arr[i]-arr[i-1]);
        }
//        System.out.println(Arrays.toString(arr)+"-->"+System.identityHashCode(arr)+"\n");
    }
}


