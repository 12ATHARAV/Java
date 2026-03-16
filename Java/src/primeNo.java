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

 


// Passing parameters to method By Value, 
//if we write method returning object, that method does not return anything

// class First
// {
//   void changeVal(int a, int b)
//    {
//      a=a+100;
//      b=b+100;
//      System.out.println("Inside changeVal a=" + a + " b=" + b);
//    }
// }
// class Demo
// {
//   public static void main(String args[ ])
//    {
//      int a=1,b=2;
//      System.out.println("Before changeVal a=" + a + " b=" + b);
//      First f=new First();
//      f.changeVal(a, b);
//      System.out.println("After changeVal a=" + a + " b=" + b);
//    }
// }
// o/p:
// Before changeVal a=1 b=2
// Inside changeVal a=101 b=102
// After changeVal a=1 b=2




// Passing parameters to method By Ref

// import java.util.*;
 
// class MyClass
// {
//      int num;
//      String res;
 
//      MyClass(int num)
//       {
//         this.num=num;
//       }
// }
// class First
// {
//   void checkEvenOdd(MyClass m)
//    {
//      if(m.num%2==0)
//                  m.res="Even";
//      else
//                  m.res="Odd";
//    }
// }
// class Demo
// {
//   public static void main(String args[ ])
//    {
//      int num;
//      Scanner sc=new Scanner(System.in); 
//      System.out.println("Enter a number");
//      num=sc.nextInt();
//      MyClass m=new MyClass(num);
//      First f=new First();
//      f.checkEvenOdd(m);  
//      System.out.println("The number " + m.num + " is: " + m.res);
//    }
// }




/// accept fno, sno and mul, div, subs, add
// import java.util.*;

// class First

// {
//      int fno, sno;
//      int sum, sub, mult, div;

//      First(int fno, int sno)
//       {
//         this.fno=fno;
//         this.sno=sno;
//       }
// }
 
// class MyLogic
// {

//   void calculate(First f)
//    {
//      f.sum=f.fno + f.sno;
//      f.sub=f.fno - f.sno;
//      f.mult=f.fno * f.sno;
//      f.div=f.fno / f.sno;
//    }
// }
 
// class Demo
// {
//   public static void main(String args[ ])
//    {
//      int fno, sno;
 
//      Scanner sc=new Scanner(System.in);

//      System.out.println("Enter first number");
//      fno=sc.nextInt();

//      System.out.println("Enter second number");
//      sno=sc.nextInt();
 
//      First f=new First(fno, sno);
 
//      MyLogic m=new MyLogic();

//      m.calculate(f);

//       System.out.println("The summation of " + f.fno + " and " + f.sno + " is: " + f.sum);
//       System.out.println("The subtraction of " + f.fno + " and " + f.sno + " is: " + f.sub);
//       System.out.println("The multiplication of " + f.fno + " and " + f.sno + " is: " + f.mult);
//       System.out.println("The division of " + f.fno + " and " + f.sno + " is: " + f.div);

//     sc.close();

//    }

// }

// // o/p:


// // Enter first number
// // 100

// // Enter second number
// // 20

// // The summation of 100 and 20 is: 120
// // The subtraction of 100 and 20 is: 80
// // The multiplication of 100 and 20 is: 2000
// // The division of 100 and 20 is: 5

 


/// circle -> take radius and output -> area, circumference

// import java.util.*;

// class Circle{
//     double radius;                //input
//     double area, circumference;   // outputs

//     Circle(double radius)
//     {
//         this.radius = radius;
//     }
// }
 
// class MyLogic
// {
//   void calculate(Circle f)
//    {
//      f.area = Math.PI * f.radius * f.radius;
//      f.circumference = 2 * Math.PI * f.radius;
//    }
// }

// class Demo
// {
//   public static void main(String args[ ])
//    {
//     double radius;
 
//      Scanner sc=new Scanner(System.in);

//      System.out.println("Enter radius: ");
//      radius = sc.nextDouble();

 
//      Circle f=new Circle(radius);
 
//      MyLogic m=new MyLogic();

//      m.calculate(f);

//       System.out.println("The area is: " + f.area);
//       System.out.println("The circumference is: " + f.circumference);
      

//     sc.close();

//    }

// }



/// circleArea, circleCircum, cylinderTsa, cylinderVol

import java.util.*;
class Circle{
    double circleRadius;                //input
    double circleArea, circleCircum;   // outputs

    Circle(double circleRadius)
    {
        this.circleRadius = circleRadius;
    }
}

class Cylinder{
    double cylinderRadius, cylinderHeight;                //input
    double cylinderTsa, cylinderVol;   // outputs

    Cylinder(double cylinderRadius, double cylinderHeight)
    {
        this.cylinderRadius = cylinderRadius;
        this.cylinderHeight = cylinderHeight;
    }
}
 
class MyLogicCircle
{
  void calculateCircle(Circle ci)
   {
     ci.circleArea = Math.PI * ci.circleRadius * ci.circleRadius;
     ci.circleCircum = 2 * Math.PI * ci.circleRadius;
   }
}

class MyLogicCylinder
{
  void calculateCylinder(Cylinder cy)
   {
     cy.cylinderTsa = 2 * Math.PI * cy.cylinderRadius * (cy.cylinderRadius + cy.cylinderHeight);
     cy.cylinderVol =  Math.PI * cy.cylinderRadius * cy.cylinderRadius * cy.cylinderHeight;
   }
}

class Demo
{
  public static void main(String args[ ])
   {
     double circleRadius, cylinderRadius, cylinderHeight;
 
     Scanner sc=new Scanner(System.in);

     System.out.print("Enter radius of circle: ");
     circleRadius = sc.nextDouble();

 
     Circle ci =new Circle(circleRadius);
 
     MyLogicCircle m=new MyLogicCircle();

     m.calculateCircle(ci);

      System.out.println("The area of circle is: " + ci.circleArea);
      System.out.println("The circumference of circle is: " + ci.circleCircum);

    System.out.println();

     System.out.print("Enter radius of cylinder: ");
     cylinderRadius = sc.nextDouble();

     System.out.print("Enter height of cylinder: ");
     cylinderHeight = sc.nextDouble();

 
     Cylinder cy =new Cylinder(cylinderRadius, cylinderHeight);
 
     MyLogicCylinder a=new MyLogicCylinder();

     a.calculateCylinder(cy);

      System.out.println("The tsa of cylinder is: " + cy.cylinderTsa);
      System.out.println("The volume of cylinder is: " + cy.cylinderVol);
      

    sc.close();

   }

}
