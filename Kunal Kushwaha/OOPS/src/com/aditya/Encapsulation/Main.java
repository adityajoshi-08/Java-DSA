package com.aditya.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Wifi joshi = new Wifi();
        System.out.println(joshi.getPassword());
        joshi.setPassword(244466666);
        System.out.println(joshi.getPassword());
    }
}
