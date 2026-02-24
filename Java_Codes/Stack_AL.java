import java.util.ArrayList;

public class Stack_AL {
    static class Stack {
        ArrayList<String> list = new ArrayList<String>();

        public void push(String data){
            list.add(data);
        }
        public boolean isEmpty(){
            return (list.size()==0);
        }
        public String pop(){
            if(isEmpty()){
                return null;
            }
            String data = list.remove(list.size() - 1);
            return data;
        }
        public String peek(){
            if(isEmpty()){
                return null;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack stack = new Stack();
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