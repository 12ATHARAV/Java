import java.util.Scanner;

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