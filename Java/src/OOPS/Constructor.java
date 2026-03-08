package OOPS;


///////  Default Constructor  ///////

// class Student{
//     Student(){
//         System.out.println("Constructor called");
//     }
// }

// public class Constructor {
//     public static void main(String[] args){
//         Student s1 = new Student();
//     }
// }




/////// Constructor for Initialization //////

// class Student{
//     int roll;
//     String name;

//     Student(){
//         roll = 1;
//         name = "Atharav";
//     }
// }

// public class Constructor {
//     public static void main(String[] args){
//         Student s1 = new Student();

//         System.out.println(s1.roll);
//         System.out.println(s1.name);
//     }
// }



////////  Parameterized Constructor  ////////

class Student{
    int roll;
    String name;

    Student(int r, String n){
        roll = r;
        name = n;
    }
}

public class Constructor {
    public static void main(String[] args){
        Student s1 = new Student(1, "Atharav");
        Student s2 = new Student(2, "Jeff");

        System.out.println(s1.name);
        System.out.println(s2.roll);
    }
}