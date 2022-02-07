package com.aditya.Questions;

//import javax.swing.text.ViewFactory;

public class SpecialFibonacci {
    public static void main(String[] args) {
        System.out.println(fibosp(4));
    }
    static int fibosp(int n){
        if (n<2){
            return n;
        }
        return (fibosp(n-1) ^ fibosp(n-2));
    }
}
