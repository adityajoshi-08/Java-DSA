import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the name : ");
        String naam = in.next();
        System.out.println(greet(naam));
    }
    static String greet(String name){
   String message = "Hello "+name;
    return message;}
}
/*java
int a = xint b = x
int temp =a
a=b
b=temp

python
a,b = b,a
* */