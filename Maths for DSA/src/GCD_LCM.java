public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(8,4));
    }
    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
