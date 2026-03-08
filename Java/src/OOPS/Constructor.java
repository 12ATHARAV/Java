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

// class Student{
//     int roll;
//     String name;

//     Student(int r, String n){
//         roll = r;
//         name = n;
//     }
// }

// public class Constructor {
//     public static void main(String[] args){
//         Student s1 = new Student(1, "Atharav");
//         Student s2 = new Student(2, "Jeff");

//         System.out.println(s1.name);
//         System.out.println(s2.roll);
//     }
// }



// ⚡ Very Important Interview Question

// What happens if we don't write a constructor?
// Java automatically creates a Default Constructor.

// Example
// class Student
// {
// }

// Java internally creates:
// Student()
// {
// }





// 🔥 Constructor Overloading
// Having multiple constructors with different parameters in the same class.

// class Student{
//     int roll;
//     String name;

//     Student(){
//         roll = 0;
//         name = "Anonymous";
//     }

//     Student(int r, String n){
//         roll = r;
//         name = n;
//     }

//     void display(){
//         System.out.println(roll + " " + name);
//     }
// }

// public class Constructor {
//     public static void main(String[] args){
//         Student s1 = new Student();
//         Student s2 = new Student(1, "Atharav");

//         s1.display();
//         s2.display();
//     }
// }



////////////  🔥 this Keyword in Java  /////////////

// this refers to current object.

// Problem without this
// class Student
// {
//     int roll;

//     Student(int roll)
//     {
//         roll = roll;   // problem
//     }
// }

// Here Java gets confused between
// instance variable and parameter.



// Correct using this
// class Student
// {
//     int roll;

//     Student(int roll)
//     {
//         this.roll = roll;
//     }
// }

// Meaning:
// this.roll → instance variable
// roll → parameter



//////// 🔥 Another Use of this ////////

// Calling another constructor. 

// class Student
// {
//     int roll;
//     String name;

//     Student()
//     {
//         this(1, "Atharav");
//     }

//     Student(int r, String n)
//     {
//         roll = r;
//         name = n;
//     }
// }

// When default constructor runs → it calls the parameterized constructor.




///// Q /////
class Test
{
    int x;

    Test(int x)
    {
        this.x = x;
    }

    void show()
    {
        System.out.println(x);
    }
}
public class Constructor {
    public static void main(String[] args){
        Test t = new Test(50);
        t.show();
    }
}