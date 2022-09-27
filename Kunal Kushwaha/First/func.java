import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        // System.out.print("The sum is : ");    
        System.out.println("The sum is : " +sum());
    }
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = input.nextInt();
        System.out.println("Enter the second number :");
        int b = input.nextInt();
        int sum = a+b;
        return sum;
        
        }
    }