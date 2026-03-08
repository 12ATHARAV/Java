package OOPS;


// 6️⃣ Single Inheritance
// One parent → one child.

// class Animal{
//     void eat(){
//         System.out.println("Animal eats food");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args){
//         Dog d = new Dog();

//         d.eat();   //inherited from Animal
//         d.bark();  // method of Dog
//     }
// }



////// 2️⃣ Multilevel Inheritance ///////
// Parent → Child → Grandchild

// class Animal{
//     void eat(){
//         System.out.println("Animal eats");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }
// class Puppy extends Dog{
//     void weep(){
//         System.out.println("Puppy weeps");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args){
//         Puppy p = new Puppy();
//         p.eat();
//         p.bark();
//         p.weep();
//     }
// }



//// 3️⃣ Hierarchical Inheritance ////
// One parent → multiple children.

// class Animal{
//     void eat(){
//         System.out.println("Animal eats");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal{
//     void meow(){
//         System.out.println("Cat Meows");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args){
//         Dog d = new Dog();
//         Cat c = new Cat();

//         d.eat();
//         d.bark();

//         c.eat();
//         c.meow();
//     }
// }




// 9️⃣ Why Java Doesn't Support Multiple Inheritance

// Example of multiple inheritance:

// A
//  \ 
//   C
//  /
// B

// If both A and B have same method → confusion occurs.

// This is called Diamond Problem.

// So Java avoids this with classes.

// But it supports multiple inheritance using interfaces.




/// 4️⃣ Important Rule in Inheritance ///

// Child object can access parent methods, but parent object cannot access child methods.