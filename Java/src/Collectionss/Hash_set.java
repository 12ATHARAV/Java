package Collectionss;

// add()
// remove()
// contains()
// size()
// isEmpty()
// clear()

import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate

        System.out.println("Set: " + set);

        set.remove(20);
        System.out.println("After remove: " + set);

        System.out.println("Contains 30? " + set.contains(30));

        System.out.println("SIze: " + set.size());

        System.out.println("Is empty? " + set.isEmpty());

        set.clear();
        System.out.println("After clear: " + set);
    }
}
