package com.aditya.Assignments;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(ans(5));
    }
    static int ans(int num){
        int start = 0;
        int end = num;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if ((mid * (mid + 1)/2) == num){
                return mid;
            }else if ((mid * (mid + 1)/2) > num){
                end = mid -1;
            }else if ((mid * (mid + 1)/2) < num){
                start = mid + 1;
            }
        }
        return end;
    }
}
