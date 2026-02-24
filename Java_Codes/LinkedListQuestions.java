
class ListNode {
    String val;
    ListNode next;
    ListNode() {}
    ListNode(String val) { this.val = val; }
    ListNode(String val, ListNode next) { this.val = val; this.next = next; }
}
public class LinkedListQuestions {
    // removing Nth node from the end
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next == null){
            return null;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int ptf = size - n;
        ListNode prev = head;
        int cp = 1;
        while(cp != ptf){
            prev = prev.next;
            cp++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public ListNode getMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        ListNode firstHalfEnd = getMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);
        ListNode last = secondHalfStart;
        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(secondHalfStart.val != firstHalfStart.val){
                firstHalfEnd.next = reverse(last);
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
        firstHalfEnd.next = reverse(last);
        return true;
    }
    public boolean isCyclic(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
    public ListNode removeCycle(ListNode head){
        if(isCyclic(head) == false){
            return head;
        }
        ListNode hare = head;
        ListNode turtle = head;
        do{
            hare = hare.next.next;
            turtle = turtle.next;
        } while(hare != turtle);
        turtle = head;
        while(turtle.next != hare.next){
            turtle = turtle.next;
            hare = hare.next;
        }
        hare.next = null;
        return head;
    }
    public static void main(String args[]){
        LinkedListQuestions llq = new LinkedListQuestions();
        ListNode g = new ListNode("Rogers", null);
        ListNode f = new ListNode("Olivia", g);
        ListNode e = new ListNode("Jake", f);
        ListNode d = new ListNode("Chris", e);
        ListNode c = new ListNode("Anna", d);
        ListNode b = new ListNode("Emma", c);
        ListNode a = new ListNode("Alex", b);
        ListNode head = llq.removeNthFromEnd(a, 1);
        llq.printList(head);
        System.out.println(llq.isPalindrome(a));
        System.out.println(llq.isCyclic(head));
        llq.removeCycle(head);
        llq.printList(head);
        llq.reverse(head);
        llq.printList(head);
    }
}
