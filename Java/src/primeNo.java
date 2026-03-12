// import java.util.Scanner;

// import javax.swing.Box;

// class primeLogic {
//     public boolean isPrime(int n) {
//         if (n <= 1) return false;
        
//         for(int i=2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
// public class primeNo {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a integer: ");
//         int num = sc.nextInt();

//         primeLogic pl = new primeLogic();

//         if(pl.isPrime(num)){
//             System.out.println(pl.isPrime(num));
//         }else{
//             System.out.println(pl.isPrime(num));
//         }
//     }
// }



//write a method which accepts 2 nos and prints all the prime nos. between those


// import java.util.Scanner;

// public class primeNo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         int original = num;
//         int reversed = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }

//         if (original == reversed) {
//             System.out.println(original + " is a palindrome number!");
//         } else {
//             System.out.println(original + " is not a palindrome number.");
//         }
//         sc.close();
//     }
// }
         

/// accept 2 numbers and print the tables of all numbers between those 2 numbers

// import java.util.Scanner;

// public class primeNo {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num1: ");
//         int num1 = sc.nextInt();

//         System.out.println("Enter num2: "); 
//         int num2 = sc.nextInt();

//         for(int i = 1; i <= 10; i++){
//             for(int j = num1; j <= num2; j++){
//                 System.out.print((i * j) + "\t");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


// import java.util.*;
 
// class MyClass
// {
//   int radius;
 
//   MyClass(int radius)
//    {
//      this.radius=radius;
//    }
 
//   void area()
//    {
//      System.out.println("Area =" + (Math.PI * radius * radius));
//    }
 
//   void circumference()
//    {
//      System.out.println("Circumference =" + (2 * Math.PI * radius));
//    }
// }
 
// class primeNo
// {
//   public static void main(String args[ ]) 
//    {
//      Scanner sc=new Scanner(System.in);
 
//      System.out.println("Enter radius");
//      int radius = sc.nextInt();
     
 
//      MyClass m=new MyClass(radius);
//      m.area();
//      m.circumference();
//    }
// }






// class Cylinder{
//     double radius, height;

//     Cylinder(double r, double h){
//         radius = r;
//         height = h;
//     }
// }

// class MyClass{
//     void calculateVolume(Cylinder b){
//         System.out.println("Volume: " + Math.PI * b.radius * b.radius * b.height);
//     }
//     void calculateTsa(Cylinder b){
//         System.out.println("Tsa: " + 2 * Math.PI * b.radius * (b.radius + b.height));
//     }
// }

// public class primeNo {
//     public static void main(String[] args){
//         Cylinder c = new Cylinder(10,11);
//         MyClass m = new MyClass();
//         m.calculateVolume(c);
//         m.calculateTsa(c);
//     }
// }




// class Box{
//     double length, width, height;
//     Box(double l, double w, double h){
//         length = l;
//         width = w;
//         height = h;
//     }
// }
// class MyClass{
//     Box doubleVal(Box b){
//         Box c = new Box(2*b.length, 2*b.width, 2*b.height);
//         return c;
//     }
// }

// public class primeNo {
//     public static void main(String[] args){
//         Box b1 = new Box(10,11,12);
//         MyClass m = new MyClass();

//         Box b2 = m.doubleVal(b1);

//         System.out.println(b1.length + " " + b1.width + " " + b1.height + " ");
//         System.out.println(b2.length + " " + b2.width + " " + b2.height + " ");
//     }
// }




// import java.util.*;
 
// class Cylinder
// {
//    double radius, height;
//    Cylinder(double r, double h)
//     {
//       radius=r;
//       height=h;
//     }
// }
 
// class Result
// {
//   double tsa, volume;
//   Result(double t, double v)
//    {
//      tsa=t;
//      volume=v;
//    }
// }
 
// class Calculator
// {
//   Result calculate(Cylinder c)
//    {
//      double tsa = 2 * Math.PI * c.radius * (c.radius + c.height);
//      double volume =  Math.PI * c.radius * c.radius * c.height;
//      Result r=new Result(tsa, volume);
//      return r;
//    }

// }
 
// class Demo

// {

//   public static void main(String args[ ])
//    {
//      Scanner sc=new Scanner(System.in);

//      System.out.println("Enter radius");
//      double r=sc.nextDouble();

//      System.out.println("Enter height");
//      double h=sc.nextDouble();

//      Cylinder c=new Cylinder(r,h);

//      Calculator cal=new Calculator();
//      Result res=cal.calculate(c);  

//      System.out.println("tsa of cylinder=" + res.tsa); 
//      System.out.println("area of cylinder=" + res.volume); 

//      sc.close();
//    }
// }

 