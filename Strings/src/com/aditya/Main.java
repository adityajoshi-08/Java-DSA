package com.aditya;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String name = "Aditya Joshi";
//        System.out.println(name);
        //Initialising and declaring a new String
        String name = "Mickey";
//        System.out.println(name);
        // To create a new string with the same value
        String a = new String("Mickey");
//        System.out.println(name == a);
        // In that case, to compare just the value, we use the equals method in JAVA
        System.out.println(a.equals(name));
    }
}
