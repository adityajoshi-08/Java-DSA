import java.util.Stack;

public class defaultStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(13);stack.push(14);stack.push(15);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.size());
    }
}