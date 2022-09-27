public class ReverseRecursion {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    static int reverse(int n){
        if(n<=0){
            return 0;
        }
        return n%10 + reverse(n/10);
    }
}
