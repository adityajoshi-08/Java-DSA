package com.aditya;

//import sun.tools.jstat.Scale;

import java.util.Scanner;

public class MultiInputOutput {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                    int num = in.nextInt();
                    arr[row][column]=num;

            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");

            }
            System.out.println();
        }
    }


}
