package com.aditya;

public class NumberExampleRecursion {

    public static void main(String[] args) {
//	    write your code here
        System.out.println();
        print(1);
    }
    static void print(int n){
//        base condition
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
//        This is tail recursion
        /*When the last step is the calling of function it
        is called tail recursion

        Ex : {
        //code
        print(n+1);}
        It is tail recursion as the last thing is calling the function

        {
        // code
        return print(n) + print(n+1);
        }
        It is not tail recursion as the last thing is addition of the two functions
        and not returning calling the function.
         */
       print(n+1);
    }


}
