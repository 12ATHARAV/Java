package OOPS;


// 🔥 Method Overriding (Very Important)

// Method overriding happens when child class provides its own implementation of a parent class method.

// Rule
// The method name, parameters, and return type must be the same.
// child overrides parent

// class Animal{
//     void sound(){
//         System.out.println("Animal makes sound");
//     }
// }
// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog barks");
//     }
// }
// public class Method_Overriding {
//     public static void main(String[] args){
//         Dog d = new Dog();
//         d.sound();
//     }
// }

// Even though Animal has sound(),
// the Dog version overrides it.





////////// 🔥 super Keyword ///////////

// super refers to the parent class object.

// It is used to:
// 1️⃣ Call parent class method
// 2️⃣ Access parent class variable
// 3️⃣ Call parent constructor


// class Animal{
//     void sound(){
//         System.out.println("Animal makes sound");
//     }
// }
// class Dog extends Animal{
//     void sound(){
//         super.sound();
//         System.out.println("Dog barks");
//     }
// }
// public class Method_Overriding {
//     public static void main(String[] args){
//         Dog d = new Dog();
//         d.sound();
//     }
// }




//////// 🔥 Runtime Polymorphism (Method Overriding) ////////
// Java decides which method to run at runtime.

// class Animal{
//     void sound(){
//         System.out.println("Animal Sounds");
//     }
// }
// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog barks");
//     }
// }
// public class Method_Overriding {
//     public static void main(String[] args){
//         Animal a = new Dog();
//         a.sound();
//     }
// }
// Even though reference type is Animal,
// Java runs Dog's method. Java checks object type at runtime, not reference type.
// This is Runtime Polymorphism.