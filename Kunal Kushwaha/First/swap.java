import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");        int num2 = in.nextInt();
        swapit(num1,num2);}
    static void swapit(int a,int b){
   int temp = a;
    a=b;
    b=temp;
        System.out.println(a+" "+b);}}