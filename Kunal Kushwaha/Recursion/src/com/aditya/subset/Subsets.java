package com.aditya.subset;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> mystr = new ArrayList<String>();
        subsetArray1("",str,mystr);
        System.out.println(mystr);
    }

    static void subsetArray1(String p, String up,ArrayList<String> strarr){
//         Processed String---------^          ^------Unprocessed String
        if (up.isEmpty()) {
            if (!p.isEmpty()){
                strarr.add(p);
            }
            return;
        }
        subsetArray1(p+up.charAt(0),up.substring(1),strarr);
        subsetArray1(p,up.substring(1),strarr);
    }

    static void subset(String p, String up){
//   Processed String---------^          ^------Processed String
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subset(p+up.charAt(0),up.substring(1));
        subset(p,up.substring(1));
    }
}
