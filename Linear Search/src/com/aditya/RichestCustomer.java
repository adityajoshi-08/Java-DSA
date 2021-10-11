//https://leetcode.com/problems/richest-customer-wealth/
package com.aditya;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{4,5,6},{4654,4564, 846454,1},{77,5}};
        return summax(accounts);
    }
    static int summax(int[][] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            sum = 0;
            for (int column = 0; column < arr[row].length; column++) {
                sum += arr[row][column];
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}

