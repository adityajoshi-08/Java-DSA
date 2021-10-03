package com.aditya;

//import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInString  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String character = in.next();
        System.out.println( Search(name,character.charAt(0)));
        //This is just a comment and nothing else!!
    }
    static boolean Search(String str,char target){
        if (str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
//            )
        }
        return false;
    }
}
