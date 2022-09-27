public class RecursionTree1 {

    static void func(int n ){
        if (n>0){
            System.out.println("Woo"+n);
            func(n-1);
            func(n-1);
        }

    }

    public static void main(String[] args) {
        func(3);
    }
}
