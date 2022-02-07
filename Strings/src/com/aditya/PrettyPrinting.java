package com.aditya;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 12.23343f;
        //printf because it is a formatted string
        //%f because it is a float
        // It rounds of as well
        System.out.printf("Number till 2 decimal placed is %.2f", a );
        System.out.println();
        System.out.printf("Pie value till 3 decimal places is %.2f", Math.PI);
        System.out.println();

        //Pretty Printing in Strings
        //%s because it is a string
        System.out.printf("Hello I am %s and I am %s","Aditya","great");
    }
}
