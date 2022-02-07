public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(sumdigits(1234));
    }
    static int sumdigits(int n){
        if (n==0){
            return 0;
        }
        return n%10 + sumdigits(n/10);
    }
}
