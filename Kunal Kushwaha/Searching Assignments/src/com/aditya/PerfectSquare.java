package com.aditya;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }

    static boolean isPerfectSquare(int num) {
        int start = 1 ;
        int end = 2147483647;
        while (start<=end){
            int mid = start + (end - start)/2;
            if ((mid*mid) == num){
                return true;
            }else if ((mid*mid) > num){
                end = mid -1;
            }else if ((mid*mid) < num){
                start = mid + 1;
            }
            return false;
        }
        return false;
    }
}

