package OOPS;

///////// 1️⃣ Private Access Modifier //////////
// class Student
// {
//     private int marks = 90;

//     void display()
//     {
//         System.out.println(marks);   // allowed
//     }
// }

// public class Access_modifiers
// {
//     public static void main(String[] args)
//     {
//         Student s = new Student();
//         s.display();      // allowed
        
//         // s.marks = 80;  ❌ ERROR (private variable)
//     }
// }



///////// Protected Access Modifier //////////
// class Animal
// {
//     protected void eat()
//     {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal
// {
//     void bark()
//     {
//         System.out.println("Dog barks");
//     }
// }

// public class Access_modifiers
// {
//     public static void main(String[] args)
//     {
//         Dog d = new Dog();

//         d.eat();   // inherited method
//         d.bark();
//     }
// }