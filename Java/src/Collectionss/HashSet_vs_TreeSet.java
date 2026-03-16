package Collectionss;

// Both are Set implementations.

// Feature	         HashSet	   TreeSet
// Duplicates	      ❌	           ❌
// Order	         No order	   Sorted
// Speed	          Faster	   Slower
// Data Structure	Hash Table	   Red-Black Tree



////////// HashSet example

// import java.util.HashSet;

// public class HashSet_vs_TreeSet{
//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();

//         set.add(30);
//         set.add(10);
//         set.add(20);

//         System.out.println(set);
//     }
// }


////////// TreeSet
import java.util.TreeSet;

public class HashSet_vs_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}