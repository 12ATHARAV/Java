package Collectionss;

// add()
// add(index, element)
// get()
// set()
// remove()
// size()
// contains()
// isEmpty()
// clear()

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        //add()
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("Initial list: " + list);

        //add(index, element)
        list.add(1, "JavaScript");
        System.out.println("After inserting: " + list);

        //get()
        System.out.println("Element at index 2: " + list.get(2));

        //set()
        list.set(2, "Go");
        System.out.println("After replacing: " + list);

        //remove()
        list.remove("Java");
        System.out.println("After removing Java: " + list);

        //contains()
        System.out.println("Contains Python?: " + list.contains("Python"));

        // size()
        System.out.println("Size: " + list.size());

        // isEmpty()
        System.out.println("Is empty? " + list.isEmpty());

        // clear()
        list.clear();
        System.out.println("After clear: " + list);
    }
}
