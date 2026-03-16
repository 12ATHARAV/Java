package Collectionss;


/////////////// Comparable
// Used for natural sorting.

// Method used:
// compareTo()


// import java.util.*;

// class Student implements Comparable<Student>{
//     int id;

//     Student(int id){
//         this.id = id;
//     }

//     public int compareTo(Student s){
//         return this.id - s.id;
//     }
// }

// public class Comparable_vs_Comparator {
//     public static void main(String[] args)
//     {
//         ArrayList<Student> list = new ArrayList<>();

//         list.add(new Student(3));
//         list.add(new Student(1));
//         list.add(new Student(2));

//         Collections.sort(list);

//         for(Student s : list)
//         {
//             System.out.println(s.id);
//         }
//     }
// }



//////////// Comparator
// Used for custom sorting.

// Method:
// compare()

// import java.util.*;

// class Student
// {
//     int id;

//     Student(int id)
//     {
//         this.id = id;
//     }
// }

// class MyComparator implements Comparator<Student>
// {
//     public int compare(Student s1, Student s2)
//     {
//         return s2.id - s1.id;
//     }
// }

// public class Comparable_vs_Comparator
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Student> list = new ArrayList<>();

//         list.add(new Student(1));
//         list.add(new Student(3));
//         list.add(new Student(2));

//         Collections.sort(list, new MyComparator());

//         for(Student s : list)
//         {
//             System.out.println(s.id);
//         }
//     }
// }


import java.util.*;

public class Comparable_vs_Comparator
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"A");
        map.put(2,"B");
        map.put(1,"C");

        System.out.println(map);
    }
}