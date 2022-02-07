package Patterns;

public class Traingle1 {
    public static void main(String[] args) {
        triangle2(4,0);
    }
    static void triangle1(int r, int c){
        if (r==0){
            return;
        }if (r>c){
            System.out.print("*");
            triangle1(r,c+1);
        }else{
            System.out.println();
            triangle1(--r,0);
        }

    }
    static void triangle2(int r, int c){
        if (r==0){
            return;
        }if (r>c){
            triangle2(r,c+1);
            System.out.print("*");
        }else{
            triangle2(--r,0);
            System.out.println();
        }

    }
}
