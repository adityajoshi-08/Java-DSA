package com.aditya.Codethon;
import java.util.ArrayList;
import java.util.Scanner;


public class Cambridge {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String srt = in.nextLine();
        cambridge("",srt,str);
    }
    static void cambridge(String p,String up,ArrayList<String> str){
        char arr[] = {'C','A','M','B','R','I','D','G','E'};
        if (up.isEmpty()){
            System.out.println(p);;
            return;
    }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == up.charAt(0)) {
                count++;
                break;
            }
        }
        if (count == 0){
            cambridge(p+up.charAt(0),up.substring(1),str);
        }else if (count!=0){
            cambridge(p,up.substring(1),str);
        }

}
}
