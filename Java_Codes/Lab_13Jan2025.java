import java.util.Scanner;

import javax.swing.tree.AbstractLayoutCache.NodeDimensions;

public class Lab_13Jan2025 {
    static class LinkedList {
        static Node head = null;

        static class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node addAtStart(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return head;
            }
            newNode.next = head;
            head = newNode;
            return head;
        }

        public static Node addAtEnd(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return head;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            return head;
        }

        public static Node addAtMiddle(String data, int index) {
            if (index > size()) {
                System.out.println("Index " + index + " is out of range for a list of size " + size());
                return null;
            }
            Node newNode = new Node(data);
            if (head == null || index == 0) {
                newNode.next = head;
                head = newNode;
                return head;
            }
            Node currNode = head;
            int i = 0;
            while (i != index - 1) {
                currNode = currNode.next;
                i++;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
            return head;
        }

        public static void print() {
            if (head == null) {
                System.out.println("The linked list is empty.");
                return;
            }
            Node currNode = head;
            System.out.print("[");
            while (currNode.next != null) {
                System.out.print(currNode.data + ", ");
                currNode = currNode.next;
            }
            System.out.print(currNode.data);
            System.out.println("]");
        }

        public static int size() {
            int size = 0;
            Node currNode = head;
            while (currNode != null) {
                currNode = currNode.next;
                size++;
            }
            return size;
        }

        public static void remove(String data) {
            Node currNode = head;
            Node prevNode = null;
            while (currNode != null && !currNode.data.equals(data)) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            if (currNode == null) {
                System.out.println("Element not found.");
                return;
            }
            if (currNode == head) {
                head = head.next;
                return;
            }
            prevNode.next = currNode.next;
        }

        public static String pop(int index) {
            if (index >= size() || index < 0) {
                return "Index out of range";
            }
            Node currNode = head;
            Node prevNode = null;
            int i = 0;
            while (i != index) {
                prevNode = currNode;
                currNode = currNode.next;
                i++;
            }
            String val = currNode.data;
            if (currNode == head) {
                head = head.next;
                return val;
            }
            prevNode.next = currNode.next;
            return val;
        }

        public static String get(int index) {
            if (index >= size() || index < 0) {
                return "Index out of range";
            }
            Node currNode = head;
            int i = 0;
            while (i != index) {
                currNode = currNode.next;
                i++;
            }
            return currNode.data;
        }
        public static Node reverse(Node head){
            if(head == null || head.next == null){
                return head;
            }
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Display the list");
            System.out.println("2. Get the size of the list");
            System.out.println("3. Add (Start, Middle, End)");
            System.out.println("4. Remove or Pop");
            System.out.println("5. Get an element by index");
            System.out.println("6. Reversing the list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    list.print();
                    break;
                case 2:
                    System.out.println("Size of the list: " + list.size());
                    break;
                case 3:
                    System.out.println("1. Add at Start\n2. Add at Middle\n3. Add at End");
                    System.out.print("Choose add option: ");
                    int addChoice = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    switch (addChoice) {
                        case 1:
                            System.out.print("Enter data to add at the start: ");
                            String startData = sc.nextLine();
                            list.addAtStart(startData);
                            break;
                        case 2:
                            System.out.print("Enter data to add: ");
                            String middleData = sc.nextLine();
                            System.out.print("Enter position (0-based index): ");
                            int position = sc.nextInt();
                            list.addAtMiddle(middleData, position);
                            break;
                        case 3:
                            System.out.print("Enter data to add at the end: ");
                            String endData = sc.nextLine();
                            list.addAtEnd(endData);
                            break;
                        default:
                            System.out.println("Invalid choice for Add.");
                    }
                    break;
                case 4:
                    System.out.println("1. Remove by value\n2. Pop by index");
                    System.out.print("Choose remove option: ");
                    int removeChoice = sc.nextInt();
                    sc.nextLine();
                    switch (removeChoice) {
                        case 1:
                            System.out.print("Enter value to remove: ");
                            String value = sc.nextLine();
                            list.remove(value);
                            break;
                        case 2:
                            System.out.print("Enter index to pop: ");
                            int popIndex = sc.nextInt();
                            System.out.println("Popped value: " + list.pop(popIndex));
                            break;
                        default:
                            System.out.println("Invalid choice for Remove.");
                    }
                    break;
                case 5:
                    System.out.print("Enter index to get: ");
                    int getIndex = sc.nextInt();
                    System.out.println("Value at index " + getIndex + ": " + list.get(getIndex));
                    break;
                case 6:
                    System.out.println("Reversing the list......");
                    list.head = list.reverse(list.head);
                    System.out.println("The reversed linked list is :- ");
                    list.print();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
