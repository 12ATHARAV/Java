// public class practiceDemo {
//     public static void main(String[] args) {
//         System.out.println("Hello Atharav");
//     }
// }


// character (pg 6)

// public class practiceDemo {
//     public static void main(String[] args) {
//         char c1, c2;
//         c1 = 'A';
//         c2 = 66;

//         System.out.println(c1);
//         System.out.println(c2);
//     }
// }



// boolean (pg 6)

// public class practiceDemo {
//     public static void main(String[] args) {
//         boolean b;
//         b = true;
//         System.out.println(b);

//         int m = 100, n = 200;
//         b = m > n;
//         System.out.println(b);
//     }
// }



// command line arguments (pg 9)

// public class practiceDemo {
//     public static void main(String[] args) {
//         System.out.println(args[1]);
//     }
// }

// public class practiceDemo {
//     public static void main(String[] args) {
//         int num1 = Integer.parseInt(args[0]);
//         int num2 = Integer.parseInt(args[1]);
//         int sum = num1 + num2;
//         System.out.println("Summation of " + num1 + " and " + num2 + " is " + sum);
//     }
// }



// operators (pg 10)

//prefix
// public class practiceDemo {
//     public static void main(String[] args) {
//         int i = 10;
//         int j = ++i;
//         System.out.println(i);
//         System.out.println(j);
//     }
// }


//postfix
// public class practiceDemo {
//     public static void main(String[] args) {
//         int i = 10;
//         int j = i++;
//         System.out.println(i);
//         System.out.println(j);
//     }
// }



// sum and reverse digits

// public class practiceDemo {
//     public static void main(String[] args) {
//         int num = Integer.parseInt(args[0]);
//         int sum = 0;
//         int rev = 0;

//         while(num > 0){
//             sum = sum + num % 10;
//             rev = rev * 10 + num % 10;
//             num = num / 10;
//         }

//         System.out.println("Summation of digits: " + sum);
//         System.out.println("Reverse of digits: " + rev);
//     }
// }



// simple java class    (pg - 14)
// class Box{
//     double width, height, length;
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b = new Box();
//         b.width = 10;
//         b.height = 11;
//         b.length = 12;
//         System.out.println("Volume: " + b.width * b.height * b.length);
//     }
// }



// simple method (pg 16)
// class Box{
//     double height, width, length;
//     void Volume(){
//         System.out.println("Volume: " + width*height*length);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b = new Box();
//         b.height = 10;
//         b.length = 12;
//         b.width = 14;
//         b.Volume();
//     }
// }



// Method accepting parameter (pg 17)
// class First{
//     void square(int num){
//         System.out.println("Square: " + num*num);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         First f = new First();
//         f.square(12);
//     }
// }



// Method returning parameters (pg 18)

// class First{
//     int square(int num){
//         return num*num;
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         First f = new First();
//         int result;
//         result = f.square(123);
//         System.out.println("Square is: "+ result);
//     }
// }



// using method to "assign values" to the set of instance variables

// class Box{
//     double width, height, length;  //instance variable

//     void assignVal(double w, double h, double l){
//         width = w;                  // w -> local variable
//         height = h;
//         length = l;
//     }

//     void Volume(){
//         System.out.println("Volume: " + width * height * length);
//     }
// }
// public class practiceDemo {
//      public static void main(String[] args) {
//         Box b1 = new Box();          // b1 -> local variable
//         b1.assignVal(12,13,14);
//         b1.Volume();

//         Box b2 = new Box();
//         b2.assignVal(15,16,17);
//         b2.Volume();
//      }
// }



//  this keyword    (pg  21)

// class Box{
//     double width, height, length;

//     void assignVal(double width, double height, double length){
//         this.width = width;
//         this.height = height;
//         this.length = length;
//     }

//     void Volume(){
//         System.out.println("Volume: " + width * height * length);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b1 = new Box();
//         b1.assignVal(10, 12, 15);
//         b1.Volume();

//         Box b2 = new Box();
//         b2.assignVal(20, 40,60);
//         b2.Volume();
//     }
// }



//  parameterless constructor   (pg 23)

// class Box{
//     double width, height, length;

//     Box(){
//         width = 10;
//         height = 11;
//         length = 12;
//     }
//     void volume(){
//         System.out.println("volume: " + width * height * length);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b = new Box();
//         b.volume();
//     }
// }



// parameterized constructor  (pg 24)

// class Box{
//     double width, height, length;

//     Box(double w, double h, double l){
//         width = w;
//         height = h;
//         length = l;
//     }

//     void volume(){
//         System.out.println("volume: " + width * height * length);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b = new Box(10,11,15);
//         b.volume();
//     }
// }



// Assigning object reference variable  (pg 25)

// class Box{
//     double width, height, length;
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b1 = new Box();

//         b1.height = 10;
//         b1.length = 20;
//         b1.width = 30;

//         Box b2 = b1;

//         System.out.println("volume: " + b1.height * b1.width * b1.length);
//         System.out.println("volume: " + b2.height * b2.width * b2.length);

//         b1.width = 666;
//         System.out.println(b2.width);
//     }
// }



// Method accepting object as a parameter

// class Box{
//     double width, height, length;

//     Box(double w, double h, double l){
//         width = w;
//         height = h;
//         length = l;
//     }
// }
// class Myclass{
//     void volume(Box b){
//         System.out.println("volume: " + b.width * b.height * b.length);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box c = new Box(10, 11, 12);
//         Myclass m = new Myclass();
//         m.volume(c);
//     }
// }



// Method returning objects  (pg  29)

// class First{
//     void display(){
//         System.out.println("This is display.");
//     }
// }
// class Second{
//     First meth(){
//         First f = new First();
//         return f;
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Second s = new Second();
//         First f1;
//         f1 = s.meth();
//         f1.display();
//     }
// }



// program showing object acceptance and return together
// ---- returns double of the value passed   (pg - 30)

// class Box{
//     double width, height, length;

//     Box(double w, double h, double l){
//         width = w;
//         height = h;
//         length = l;
//     }
// }
// class Myclass{
//     Box twice(Box b){
//         Box c = new Box(b.width*2, b.height*2, b.length*2);
//         return c;
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b1 = new Box(10, 11, 12);
//         Myclass m = new Myclass();

//         Box b2 = m.twice(b1);

//         System.out.println(b1.width + " " + b1.height + " " + b1.length);
//         System.out.println(b2.width + " " + b2.height + " " + b2.length);
//     }
// }


// Passing parameters to methods by value & by reference
//  By value       (pg   32)

// class First{
//     void changeVal(int a, int b){
//         a = a + 100;
//         b = b + 100;
//         System.out.println("Inside changeVal a = " + a + "   b = " + b);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         System.out.println("Before changeVal a = " + a + "   b = " + b);

//         First f = new First();
//         f.changeVal(a, b);
//         System.out.println("After changeVal a = " + a + "   b = " + b);
//     }
// }


// By Reference   (pg  33)

// class First{
//     int a = 1;
//     int b = 2;
// }
// class Second{
//     void changeVal(First f){
//         f.a = f.a + 100;
//         f.b = f.b + 100;
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         First obj = new First();
//         System.out.println("Before changeVal a=" + obj.a +"  b=" + obj.b);

//         Second s = new Second();
//         s.changeVal(obj);
//         System.out.println("After changeVal a=" + obj.a + "  b=" + obj.b);
//     }
// }



//  Method overloading (pg 35)
// class First{
//     void display(){
//         System.out.println("this is display");
//     }
//     void display(int num){
//         System.out.println("Square = " + num*num);
//     }
//     void display(int num1, int num2){
//         System.out.println("Multiplication = " + num1 * num2);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         First f = new First();

//         f.display();
//         f.display(10);
//         f.display(15,25);
//     }
// }


// Constructor overloading     (pg 37)
// class Box{
//     double height, width, length;

//     Box(double h, double l, double w){
//         width = w;
//         height = h;
//         length = l;
//     }
//     Box(){
//         width = height = length = 11;
//     }
//     Box(double side){
//         width = height = length = side;
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Box b;
        
//         b = new Box();
//         System.out.println(b.height);

//         b = new Box(10,20,30);
//         System.out.println(b.width);

//         b = new Box(10);
//         System.out.println(b.length);
//     }
// }


// Static - Keyword         (pg - 39)

// class First{
//     static int a = 100;

//     static void meth(){
//         System.out.println("This is static method.");
//     }

//     static{
//         System.out.println("This is static block.");
//     }
// }
// public class practiceDemo {
//     static{
//         System.out.println("this is static block in practiceDemo class.");
//     }

//     public static void main(String[] args) {
//         System.out.println("Hello");
//         System.out.println(First.a);     //static variable is accessed
//         First.meth();        //static method accessed

//         First f1 = new First();
//         First f2 = new First();

//         System.out.println(f1.a);
//         System.out.println(f2.a);

//         f1.a = 200;
//         System.out.println(f2.a);
//         System.out.println(First.a);

//         f1.meth();
//         f2.meth();

//     }
// }


// final - keyword      (pg - 42)
// class First{
//     final int i = 100;
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         First f = new First();
//         System.out.println(f.i);

//         // f.i = 200;        gives compile time error
//         // System.out.println(f.i);
//     }
// }



// Nested classes
// class Outer{
//     int a = 100;
//     Inner obj = new Inner();

//     void access(){
//         Inner i = new Inner();
//         i.showa();
//     }
//     class Inner{
//         void showa(){
//             System.out.println("a = " + a);
//         }
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Outer o = new Outer();
//         o.access();

//         o.obj.showa();

//         Outer.Inner oi = new Outer().new Inner();
//         oi.showa();
//     }
// }



// Inheritance          (pg - 45)
// simple inheritance        (pg - 46)
// class First{
//     int a;
//     void showa(){
//         System.out.println("a = " + a);
//     }
// }
// class Second extends First{
//     int b;
//     void showab(){
//         System.out.println("a = " + a + " b = " + b);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Second s = new Second();

//         s.a = 100;
//         s.b = 200;
//         s.showab();
//         s.showa();
//     }
// }



// Member access in inheritance
// class First{
//     int a;
//     void showa(){
//         System.out.println("a = " + a);
//     }
// }
// class Second extends First{
//     int b;
//     void showab(){
//         System.out.println("a = " + a + " b = " + b);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         First f = new Second();
//         f.a = 100;
//         f.showa();

//         // f.b = 100;
//         // f.showab();
//     }
// }



// super keyword      (pg - 49)
// 1. to call the constructor of super class.
// class Box{
//     double width, height, length;

//     Box(double w, double h, double l){
//         width = w;
//         height = h;
//         length = l;
//     }

//     void volume(){
//         System.out.println("Volume = " + width * height * length);
//     }
// }
// class Mybox extends Box{
//     double density;

//     Mybox(double w, double h, double l, double d){
//         super(w, h, l);
//         density = d;
//     }

//     void mass(){
//         System.out.println("Mass = " + width * height * length * density);
//     }
// }
// class practiceDemo{
//     public static void main(String[] args) {
//         Mybox m = new Mybox(10, 10, 10, 5);
//         m.volume();
//         m.mass();
//     }
// }


// 2. to refer member inherited from super class
// class First{
//     int a = 100;
// }
// class Second extends First{
//     int a = 200;

//     void access(){
//         System.out.println(super.a);
//     }
// }
// class practiceDemo{
//     public static void main(String[] args) {
//         Second s = new Second();
//         System.out.println(s.a);
//         s.access();
//     }
// }


// Multilevel hierarchy of inheritance   (pg - 52)
// class First{
//     int a;

//     void showa(){
//         System.out.println("a = " + a);
//     }
// }
// class Second extends First{
//     int b;

//     void showab(){
//         System.out.println("a = " + a + " b = " + b);
//     }
// }
// class Third extends Second{
//     int c;

//     void showabc(){
//         System.out.println("a = " + a + " b = " + b + " c = " + c);
//     }
// }
// public class practiceDemo {
//     public static void main(String[] args) {
//         Third t = new Third();
//         t.a = 100;
//         t.b = 200;
//         t.c = 300;
//         t.showa();
//         t.showab();
//         t.showabc();
//     }
// }


// How the constructors are called in multi-level hierarchy   (pg  54)
class First{
    First(){
        System.out.println("Constructor of First class");
    }
}
class Second extends First{
    Second(){
        System.out.println("Constructor of Second class");
    }
}
class Third extends Second{
    Third(){
        System.out.println("Constructor of third class");
    }
}
public class practiceDemo {
    public static void main(String[] args) {
        new Third();
    }
}