import java.util.*;

public class LinkedList_1_CollectionFramework {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Olivia, 26 years old");
        list.add("Jake, 24 years old");
        list.addFirst("John, 27 years old");
        list.addLast("Jane, 24 years old");
        list.add(4, "Liana, 23 years old");
        list.add("Elsa, 22 years old");
        list.add("Chris, 21 years old");
        list.add("Anna, 21 years old");
        list.add("Emma, 20 years old");
        list.add("Alex, 18 years old");
        list.removeFirst();
        list.remove(2);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        Collections.reverse(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        Collections.reverse(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
