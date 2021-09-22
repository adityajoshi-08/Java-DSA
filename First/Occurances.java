// Program to display number of times a digit occurs in a number
import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = in.nextInt();
        System.out.print("Enter the digit :");
        int digit = in.nextInt();
        int check,count =0;
        while(num >= 1){
            check = num%10;
            if (check == digit){
                count+=1;}
            num /=10;
            }
        System.out.println(count + " times");


    }
}
