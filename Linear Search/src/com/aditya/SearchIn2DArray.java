package com.aditya;

import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(search2D(array,num));

    }
    static boolean search2D(int[][] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
