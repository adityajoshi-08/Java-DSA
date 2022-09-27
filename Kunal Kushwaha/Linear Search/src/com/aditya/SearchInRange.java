package com.aditya;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5,6};
        Scanner in = new Scanner(System.in);
        int tar = in.nextInt();
        System.out.println(SearchRange(array,tar,2,5));

    }
    static boolean SearchRange(int[] arr,int target, int r1, int r2){
        if (arr.length == 0){
            return false;
        }
        for (int i = r1; i<=r2 ; i++) {
            if (arr[i] == target){
                return true;
            }

//            )
        }
        return false;
    }
}

