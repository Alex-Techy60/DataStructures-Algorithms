public class Stack_LL {
    private static class ListNode {
        String val;
        ListNode next;
        ListNode() {}
        ListNode(String val) { this.val = val; }
        ListNode(String val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Stack {
        static ListNode head = null;
        public static void push(String val){
            ListNode newNode = new ListNode(val);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }
        public static boolean isEmpty(){
            return (head == null);
        }
        public static String pop(){
            if(isEmpty()){
                return null;
            }
            ListNode temp = head;
            head = head.next;
            return temp.val;
        }
        public static String peek(){
            if(isEmpty()){
                return null;
            }
            return head.val;
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
