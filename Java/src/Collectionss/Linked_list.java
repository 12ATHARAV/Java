package Collectionss;

// addFirst()
// addLast()
// removeFirst()
// removeLast()
// getFirst()
// getLast()

import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original: " + list);

        list.addFirst(11);
        list.addLast(1111);

        System.out.println("List after addFirst/addLast: " + list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("List element: " + list.getLast());


        list.removeFirst();
        list.removeLast();

        System.out.println("list after removeFirst/removeLast: " + list);
    }
}
