package com.aditya;

import java.util.ArrayList;

public class IntersectionOf2Arrays1 {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,2,3,2};
        int[] n2 = {3,23,23,3,2};
        System.out.println(intersection(n1,n2));
    }
    static ArrayList<Integer> intersection(int[] num1, int[] num2 ){
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < num1.length-1; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j] && !list.contains(num1[i])){
                    list.add(num1[i]);
                }

            }

        }
        return list; 
    }
}
