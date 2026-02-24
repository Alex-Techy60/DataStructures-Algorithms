import java.util.Stack;

public class Stack_Problems {
    // adding levels at the bottom of the stack
    public static void addAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp = s.pop();
        addAtBottom(s, data);
        s.push(temp);
    }
    // reversing the list
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverse(s);
        addAtBottom(s, temp);
    }
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        addAtBottom(stack, 1);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
