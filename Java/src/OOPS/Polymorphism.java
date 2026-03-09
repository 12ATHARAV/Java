package OOPS;

///// 1️⃣ Compile-Time Polymorphism (Method Overloading) /////
// Same method name, different parameters.

// class MathOperations
// {
//     int add(int a, int b){
//         return a + b;
//     }

//     int add(int a, int b, int c){
//         return a + b + c;
//     }
// }
// public class Polymorphism {
//     public static void main(String[] args){
//         MathOperations m = new MathOperations();

//         System.out.println(m.add(5, 8));
//         System.out.println(m.add(2,5,9));
//     }
// }
// Java decides which method to call at compile time.



//// 2️⃣ Runtime Polymorphism (Method Overriding) ////
// class Animal
// {
//     void sound()
//     {
//         System.out.println("Animal sound");
//     }
// }

// class Dog extends Animal
// {
//     void sound()
//     {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal
// {
//     void sound()
//     {
//         System.out.println("Cat meows");
//     }
// }

// public class Polymorphism
// {
//     public static void main(String[] args)
//     {
//         Animal a;

//         a = new Dog();
//         a.sound();

//         a = new Cat();
//         a.sound();
//     }
// }
// Java chooses method at runtime.




// ⚡ Very Important Interview Question

// Can we override static methods?

// Answer:
// No. Static methods cannot be overridden.
// They can only be hidden.