package OOPS;

// 1️⃣ What is an Interface?
// An interface is a blueprint of a class that contains abstract methods.
// It defines what a class should do, not how it does it.

// 2️⃣ Syntax
// interface Animal
// {
//     void sound();
// }

// Methods are abstract by default.



/////////// 3️⃣ Complete Example ////////////

// interface Animal{
//     void sound();
// }
// class Dog implements Animal{
//     public void sound(){
//         System.out.println("Dog barks");
//     }
// }
// class Cat implements Animal{
//     public void sound(){
//         System.out.println("Cat meows");
//     }
// }
// public class Interfaces {
//     public static void main(String[] args){
//         Animal a;

//         a = new Dog();
//         a.sound();

//         a = new Cat();
//         a.sound();

//     }
// }



// 4️⃣ Why Use Interfaces?

// Main reasons:

// ✔ Achieve abstraction
// ✔ Achieve multiple inheritance
// ✔ Standardize behavior



///////// 5️⃣ Multiple Inheritance Using Interface ///////// 

interface A{
    void show();
}
interface B{
    void display();
}
class Interfaces implements A, B {
    public void show(){
        System.out.println("Show method");
    }    
    public void display(){
        System.out.println("Display method");
    }
    public static void main(String[] args){
        Interfaces i = new Interfaces();

        i.show();
        i.display();
    }
}