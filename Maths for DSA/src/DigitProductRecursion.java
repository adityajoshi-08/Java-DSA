import javax.swing.*;

public class DigitProductRecursion {
    public static void main(String[] args) {
        System.out.println(productdigits(123));
    }
    static int productdigits(int n){
        if (n==1){
            return 1;
        }
        return n%10 * productdigits(n/10);
    }
}
