package Collectionss;

// Stream API is used to process collections easily.

// Example tasks:
// Filtering
// Sorting
// Mapping
// Counting


//////// Example without Streams /////////

// import java.util.*;
// public class Stream_API {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(10);
//         list.add(25);
//         list.add(30);
//         list.add(15);

//         for(int i : list){
//             if(i > 20){
//                 System.out.println(i);
//             }
//         }
//     }
// }




////////// Same example using streams //////////

// import java.util.*;
// import java.util.stream.*;

// public class Stream_API {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(10);
//         list.add(25);
//         list.add(30);
//         list.add(15);

//         list.stream()
//             .filter(x -> x > 20)
//             .forEach(System.out::println);
//     }
// }



/////////// Example: square numbers using stream ////////////
import java.util.*;
import java.util.stream.*;

public class Stream_API {
    public static void main(String[] args){
        int[] list = {1,2,3,4,5};

        Arrays.stream(list)
              .map(x -> x*x)
              .forEach(System.out::println);
    }
}