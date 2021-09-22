import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("The answer is : "+calc());
        
    }
    static float calc() {
        float ans = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a;
        a= in.nextInt();
        System.out.print("Enter the second number: ");
        int b;
        b = in.nextInt();
        System.out.print("Enter an operator: ");
        String operator = in.next();
        switch (operator) {
            case "+" -> ans = (a+b);
            case "-" -> ans = (a-b);
            case "*" -> ans = (a*b);
            case "/" -> { if(b!=0){
                ans = (a/b);}
                else{
                System.out.println("invalid operation");}
            }
            default -> System.out.println("Enter a valid Operator!");
        }
        return ans;
    }
    
}
