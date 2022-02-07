package com.aditya.Questions;

public class FirstUpperCase {
    public static void main(String[] args) {
        String str = "adtya";
        firstUpper(str);
    }
    static void firstUpper(String str){
        if (str.length() == 0){
            return;
        }
        if (Character.isUpperCase(str.charAt(0))){
//            System.out.println(str.charAt(0));
            System.out.println(str.charAt(0));
            return;
        }
        firstUpper(str.substring(1,str.length()));

    }
}
