import java.util.Stack;

public class SortingStackUsingRecursion {
    public static void sortStack(Stack<Integer> s){
        if(s.size() < 2){
            return;
        }
        int curr = s.pop();
        sortStack(s);
        pushCorrectly(s, curr);
    }
    private static void  pushCorrectly(Stack<Integer> s, int curr){
        if(s.isEmpty() || s.peek() < curr){
            s.push(curr);
            return;
        }
        int temp = s.pop();
        pushCorrectly(s, curr);
        s.push(temp);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("Stack before: " + s);
        sortStack(s);
        System.out.println("Stack after: " + s);
    }
}
