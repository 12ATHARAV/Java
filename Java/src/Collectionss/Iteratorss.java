package Collectionss;

// An Iterator is used to traverse (loop through) elements of a collection.

// Works with:
// ArrayList
// HashSet
// LinkedList


// Syntax
// Iterator<Type> it = collection.iterator();


// Important methods:
// hasNext()
// next()
// remove()


// Example with ArrayList

// import java.util.ArrayList;
// import java.util.Iterator;

// public class Iteratorss {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(10);
//         list.add(20);
//         list.add(30);

//         Iterator<Integer> it = list.iterator();

//         while(it.hasNext()){         //hasNext() → checks if element exists
//             System.out.println(it.next());   //next() → returns next element
//         }
//     }
// }


// Removing Elements Using Iterator
import java.util.*;

public class Iteratorss {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){         
            int num = it.next();
            if(num == 20){
                it.remove();
            } 
            // System.out.println(list);
        }
        System.out.println(list);
    }
}