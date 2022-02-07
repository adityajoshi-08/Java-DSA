package com.aditya.StringAssignment;

public class GoalParser {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al))"));
    }
    static String interpret(String command){
        if (command.length() == 0){
            return "";
        }
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans += "o";
            }if (command.charAt(i) == '(' || command.charAt(i) == ')'){
              ans+="";
            }else{
                ans+=command.charAt(i);
            }
        }
        return ans;
    }
}
