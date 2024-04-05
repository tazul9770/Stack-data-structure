// reverse stack in java
import java.util.Stack;
public class Reverse {
    public static Stack<Integer> reverse(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()) {
            int element = stack.pop();
            temp.push(element);
        }
        return temp;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(54);
        stack.push(92);

        System.out.println("Original stack: " +stack);

        Stack<Integer> x = reverse(stack);

        System.out.println("Reversed stack: " +x);
    }
}