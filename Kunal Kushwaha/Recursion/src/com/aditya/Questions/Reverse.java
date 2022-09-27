package com.aditya.Questions;

public class Reverse {
    public static void main(String[] args){
        String name = "Aditya";
        System.out.println(reverse(name));
    }
    static String reverse(String str){
        if(str.length() == 1) {
            return Character.toString(str.charAt(0));
        }
        String letter = Character.toString(str.charAt(str.length()-1));
        return letter + reverse(str.substring(0,str.length()-1));
    }
}