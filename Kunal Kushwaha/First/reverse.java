import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rem,rev = 0;
        System.out.print("Enter the number :");
        int num = input.nextInt();
        while (num>=1) {
            rem = num %10;
            rev = (rev*10) + rem;
            num /= 10;

        }
        System.out.println("The rversed number is "+ rev);
    }
}
