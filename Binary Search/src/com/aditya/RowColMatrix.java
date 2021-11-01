package com.aditya;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        System.out.println(Arrays.toString(search(arr, 34)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int column = matrix[row].length-1;
        while(row < matrix.length && column >= 0 ){
            if (matrix[row][column] == target){
                return new int[]{row,column};
            }else if (target< matrix[row][column]){
                column--;
            }else if (target > matrix[row].length){
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
