import java.util.Stack;

public class Stack_CL {
    public static void main(String args[]){
        Stack<String> stack = new Stack<>();
        stack.push("Olivia");
        stack.push("Jake");
        stack.push("Chris");
        stack.push("Emma");
        stack.push("Anna");
        stack.push("Alex");
        stack.push("John");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
