public class Lab_27Jan2025_Stack{
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        static Node head;
        static Node top;
        public static void add(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                top = newNode;
                return;
            }
            top.next = newNode;
            top = newNode;
        }
        public static String peek(){
            if(top == null){
                return "underflow";
            } else{
                return top.data;
            }
        }
        public static String delete(){
            if(top == null){
                return "underflow";
            }else if(head.next == null){
                String val = top.data;
                head = top = null;
                return val;
            } else{
                Node newNode = head;
                while(newNode.next != top){
                    newNode = newNode.next;
                }
                newNode.next = null;
                String val = top.data;   
                top = newNode;             
                return val;
            }
        }
        public static void print(){
            if(head == null){
                System.out.println("No elements are present");
                return;
            }
            Node newNode = head;
            System.out.print("[");
            while(newNode.next != null){
                System.out.print(newNode.data + ", ");
                newNode = newNode.next;
            }
            System.out.println(top.data + "]");
        }
        
    }



    static class Queue{
        static Node front;
        static Node rear;
        public static void add(String data){
            Node newNode = new Node(data);
            if(rear == null || front == null){
                rear = front = newNode;
                return;
            }
            rear.next = newNode;
            rear = rear.next;
            return;
        }
        public static String delete(){
            if(front == null){
                return "Underflow";
            } else if(front == rear){
                String val = front.data;
                front = rear = null;
                return val;
            } else{
                String val = front.data;
                front = front.next;
                return val;
            }
        }
        public static String peek(){
            if(front == null){
                return "underflow";
            }
            return front.data;
        }
        public static void print(){
            if(front == null){
                System.out.println("There's no element, the queue is empty");
                return;
            }
            Node newNode = front;
            System.out.print("[");
            while(newNode.next != null){
                System.out.print(newNode.data + ", ");
                newNode = newNode.next;
            }
            System.out.println(rear.data + "]");
        }
    }
    public static void main(String args[]){
        LinkedList S_list = new LinkedList();
        S_list.print();
        S_list.add("Olivia");
        S_list.add("jake");
        S_list.add("Chris");
        S_list.add("Munchkin");
        S_list.print();
        System.out.println(S_list.delete());
        S_list.add("Emma");
        S_list.add("Anna");
        S_list.add("Alex");
        S_list.print();
        System.out.println(S_list.peek());
        Queue Q_list = new Queue();
        Q_list.print();
        Q_list.add("Olivia");
        Q_list.add("jake");
        Q_list.add("Chris");
        Q_list.add("Munchkin");
        Q_list.print();
        System.out.println(Q_list.delete());
        Q_list.add("Emma");
        Q_list.add("Anna");
        Q_list.add("Alex");
        Q_list.print();
        System.out.println(Q_list.peek());
    }
}