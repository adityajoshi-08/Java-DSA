// Program to find nth number of Fibonacci Series
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0, third = 0;
        int second = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Which Number ? : ");
        int count = in.nextInt();
        if (count == 1){
            System.out.println("Required value is "+ 0);
        }
        else if (count == 2){
            System.out.println("Required value is "+ 1);
        }
        else {
           for(int i = 0;i<count-2;i+=1){
                third = first + second;
                first = second;
                second = third;
//                System.out.println(third);

            }
            System.out.println("Required value is "+ third);
        }
        }

    }

