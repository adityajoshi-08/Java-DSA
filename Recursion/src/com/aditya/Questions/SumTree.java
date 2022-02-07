package com.aditya.Questions;

import java.util.Arrays;

public class SumTree {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumtr(arr);
    }


        static void sumtr(int[] up){

            if (up.length < 1){
                return;
            }
            int[] p = new int[up.length-1];
            for (int i = 0; i < up.length-1; i++) {
                p[i] = up[i] + up[i+1];
            }
            sumtr(p);
            System.out.println(Arrays.toString(up));
        }
    }

