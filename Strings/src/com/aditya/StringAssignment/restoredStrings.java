package com.aditya.StringAssignment;

import java.util.Arrays;

public class restoredStrings {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoredString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
//        char[] arr = new char[8];
//        arr[4] = 'a';
//        System.out.println(Arrays.toString(arr));

    }
    static String restoredString(String s, int[] indices){
        if (indices.length == 0 || s.length() == 0){
            return "";
        }
        if (s.length() != indices.length){
            return "";
        }
//        int[] arr = new int[s.length()];
        char[] ch = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {

            ch[indices[i]] = s.charAt(i);
        }
//        System.out.println(ch);
        String ans = "";
        for (int i = 0; i < ch.length; i++) {
            ans += ch[i];
        }
        return ans;
}
}
