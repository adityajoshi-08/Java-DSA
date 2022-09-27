package com.aditya;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Aditya Joshi";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("      Aditya Joshi ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
