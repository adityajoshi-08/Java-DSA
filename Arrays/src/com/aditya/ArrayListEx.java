package com.aditya;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Functions in arrays
        list.add(221);
        System.out.println(list);
        list.set(0,100); //set the element at 0th index to 99
        System.out.println(list);
        list.remove(0); //remove the element at 0th index
        System.out.println(list);
        list.add(1323);
        System.out.println(list.get(0));
    }
}
