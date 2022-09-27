import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();
        System.out.println(isarmstrong(number));
        for (int i = 100; i < 1000; i++) {
            if (isarmstrong(i)) {
                System.out.println(i + "");
            }
        }
    }

    static boolean isarmstrong(int a) {
        int original = a;
        int sum = 0;
        while (a >= 1) {
            int rem = a % 10;
            sum += rem * rem * rem;
            a /= 10;
        }
        return sum == original;
    }
}