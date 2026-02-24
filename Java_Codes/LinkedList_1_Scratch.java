// public class LinkedList_1_Scratch {
//     Node head;
//     private int size;
//     LinkedList_1_Scratch(){
//         size = 0;
//     }
//     public class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//         size++;
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }
//     // public String get(int index){
//     //     if(head==null){
//     //         return "The list is empty";
//     //     }
//     //     if(index>size || index<0){
//     //         return "Invalid index";
//     //     }
//     //     Node currNode = head;
//     //     for(int i=0; i<size; i++){
//     //         if(i==index){
//     //             return currNode.data;
//     //         }
//     //         currNode = currNode.next;
//     //     }
//     // }
//     public void print(){
//         if(head==null){
//             System.out.println("The list is empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("null");
//     }
//     public void removeFirst(){
//         if(head == null){
//             System.out.println("The list is already empty");
//             return;
//         }
//         head = this.head.next;
//         size--;
//     }
//     public void removeLast(){
//         if(head == null){
//             System.out.println("The list is already empty");
//             return;
//         }
//         size--;
//         if(head.next == null){
//             head = null;
//         }
//         Node currNode = head;
//         Node nextNode = currNode.next;
//         while(nextNode.next != null){
//             currNode = currNode.next;
//             nextNode = nextNode.next;
//         } 
//         currNode.next = null;
//     }
//     public int size(){
//         return size;
//     }
//     public void addAt(int index, String data){
//         if(index>size || index<0){
//             System.out.println("Invalid index");
//             return;
//         }
//         size++;
//         Node newNode = new Node(data);
//         if(head==null || index == 0){
//             newNode.next = head;
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         for(int i=0; i<size; i++){
//             if(i==index){
//                 Node tempNode = currNode.next;
//                 currNode.next = newNode;
//                 newNode.next = tempNode;
//                 break;
//             }
//             currNode = currNode.next;
//         }
//         // public void removeAt(int index){
//         //     if(head == null){
//         //         System.out.println("The list is already empty");
//         //         return;
//         //     }
//         //     if(index>size || index<0){
//         //         System.out.println("Invalid index");
//         //         return;
//         //     }
//         //     if(head.next == null && index == 0){
//         //         head = null;
//         //         return;
//         //     }
//         //     Node currNode = head;
//         //     Node nextNode = currNode.next;
//         //     for(int i=0; i<size; i++){
//         //         if(i == index){
//         //             currNode.next = nextNote.next;
//         //             break;
//         //         }
//         //         currNode = currNode.next;
//         //         nextNode = nextNode.next;
//         //     }
//         // }
//     }
//     public static void main(String args[]){
//         LinkedList_1_Scratch list = new LinkedList_1_Scratch();
//         list.addFirst("Olivia, 26 years old");
//         list.addLast("Jake, 24 years old");
//         list.addFirst("John, 27 years old");
//         list.addLast("Jane, 24 years old");
//         list.addAt(4, "Liana, 23 years old");
//         list.addLast("Elsa, 22 years old");
//         list.addLast("Chris, 21 years old");
//         list.addLast("Anna, 21 years old");
//         list.addLast("Emma, 20 years old");
//         list.addLast("Alex, 18 years old");
//         list.removeFirst();
//         list.print();
//         // list.removeAt(2);
//         // for(int i=0; i<list.size(); i++){
//         //     System.out.println(list.get(i));
//         // }
//     }
// }











































// public class LinkedList_1_Scratch {
//     Node head;
//     private int size;

//     LinkedList_1_Scratch() {
//         size = 0;
//     }

//     public class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//         size++;
//     }

//     public void addLast(String data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     public String get(int index) {
//         if (head == null) {
//             return "The list is empty";
//         }
//         if (index >= size || index < 0) {
//             return "Invalid index";
//         }
//         Node currNode = head;
//         for (int i = 0; i < index; i++) {
//             currNode = currNode.next;
//         }
//         return currNode.data;
//     }

//     public void print() {
//         if (head == null) {
//             System.out.println("The list is empty");
//             return;
//         }
//         Node currNode = head;
//         while (currNode != null) {
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("null");
//     }

//     public void removeFirst() {
//         if (head == null) {
//             System.out.println("The list is already empty");
//             return;
//         }
//         head = head.next;
//         size--;
//     }

//     public void removeLast() {
//         if (head == null) {
//             System.out.println("The list is already empty");
//             return;
//         }
//         size--;
//         if (head.next == null) {
//             head = null;
//             return;
//         }
//         Node currNode = head;
//         while (currNode.next.next != null) {
//             currNode = currNode.next;
//         }
//         currNode.next = null;
//     }

//     public int size() {
//         return size;
//     }

//     public void addAt(int index, String data) {
//         if (index > size || index < 0) {
//             System.out.println("Invalid index");
//             return;
//         }
//         size++;
//         Node newNode = new Node(data);
//         if (head == null || index == 0) {
//             newNode.next = head;
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         for (int i = 0; i < index - 1; i++) {
//             currNode = currNode.next;
//         }
//         newNode.next = currNode.next;
//         currNode.next = newNode;
//     }

//     public void removeAt(int index) {
//         if (head == null) {
//             System.out.println("The list is already empty");
//             return;
//         }
//         if (index >= size || index < 0) {
//             System.out.println("Invalid index");
//             return;
//         }
//         size--;
//         if (index == 0) {
//             head = head.next;
//             return;
//         }
//         Node currNode = head;
//         for (int i = 0; i < index - 1; i++) {
//             currNode = currNode.next;
//         }
//         currNode.next = currNode.next.next;
//     }

//     public static void main(String[] args) {
//         LinkedList_1_Scratch list = new LinkedList_1_Scratch();
//         list.addFirst("Olivia, 26 years old");
//         list.addLast("Jake, 24 years old");
//         list.addFirst("John, 27 years old");
//         list.addLast("Jane, 24 years old");
//         list.addAt(4, "Liana, 23 years old");
//         list.addLast("Elsa, 22 years old");
//         list.addLast("Chris, 21 years old");
//         list.addLast("Anna, 21 years old");
//         list.addLast("Emma, 20 years old");
//         list.addLast("Alex, 18 years old");
//         list.removeFirst();
//         list.removeAt(2);
//         for(int i=0; i<list.size; i++){
//             System.out.println(list.get(i));
//         }
//         System.out.println("Size of the list: " + list.size());
//     }
// }











































public class LinkedList_1_Scratch {

    Node head;
    private int size;

    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return;
    }
    public void addAt(int index, String data){
        if(index>size || index<0){
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(data);
        size++;
        if(head == null || index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        if(head.next == null || index == 1){
            newNode.next = head.next;
            head.next = newNode;
            return;
        }
        for(int i=1; i<index; i++){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }
    public void print(){
        if(head == null){
            System.out.println("There's nothing to print as list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
        
    }
    public String get(int index){
        if(index>=size || index<0){
            return "Invalid index";
        }
        Node currNode = head;
        for(int i=0; i<index; i++){
            currNode = currNode.next;
        }
        return currNode.data;
    }
    public int length(){
        return size;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("The list is empty and there's nothing to remove");
            return;
        }
        size--;
        head = head.next;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("The list is empty and there's nothing to remove");
            return;
        }
        size--;
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    public void removeAt(int index){
        if(head == null){
            System.out.println("The list is empty and there's nothing to remove");
            return;
        }
        if(index>=size || index<0){
            System.out.println("Invalid index");
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node currNode = head;
        for(int i=1; i<index; i++){
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        return;
    }
    public void removeFromEnd(int index){
        if(index>=size || index<0){
            System.out.println("Invalid Index");
        } 
        index = size - 1 - index;
        removeAt(index);
    }
    public int index(String data){
        Node currNode = head;
        int i = 0;
        while(currNode != null){
            if(currNode.data == data){
                return i;
            }
            currNode = currNode.next;
            i++;
        }
        return -1;
        
    }
    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr.next != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = curr;
    }
    public Node reverseList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public boolean isCyclic(Node head){
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
    public void swap() {
        if (head == null || head.next == null) {
            return; // No swap needed for empty or single-node list
        }
    
        Node dummy = new Node(""); // Dummy node to handle head swaps
        dummy.next = head;
        Node prev = dummy;
    
        while (prev.next != null && prev.next.next != null) {
            // Nodes to be swapped
            Node first = prev.next;
            Node second = first.next;
    
            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;
    
            // Move to the next pair
            prev = first;
        }
    
        head = dummy.next; // Update head after swapping
    }
    
    public static void main(String args[]){
        LinkedList_1_Scratch list = new LinkedList_1_Scratch();
        list.addFirst("Hey");
        list.addAt(1, "there");
        list.addLast("Alex");
        list.addAt(2, "I'm");
        list.print();
        System.out.println(list.get(3));
        System.out.println(list.length());
        list.addFirst("Good");
        list.addAt(1, "Morning");
        list.addLast("Bye bye");
        list.print();
        System.out.println(list.length());
        list.removeAt(1);
        list.removeFirst();
        list.removeLast();
        list.print();
        System.out.println(list.index("Alex"));
        list.reverse();
        list.print();
        list.reverse();
        list.print();
        list.swap();
        list.print();
        list.swap();
        list.print();
    }
}