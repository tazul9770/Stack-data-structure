// stack data structure using java collection framework
import java.util.Stack;
public class StackDemo3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(45);
        s.push(23);
        s.push(223);
        s.push(67);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}