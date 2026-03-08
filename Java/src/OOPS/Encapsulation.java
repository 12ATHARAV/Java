package OOPS;

// Encapsulation is the process of wrapping data and methods together inside a
// class and restricting direct access to the data using private variables and public getter and setter methods.

// class BankAccount{
//     private int balance;

//     public void setBalance(int b){
//         balance = b;
//     }
//     public int getBalance(){
//         return balance;
//     }
// }

// public class Encapsulation {
//     public static void main(String[] args){
//         BankAccount b = new BankAccount();
//         b.setBalance(1020020053);
//         System.out.println(b.getBalance());
//     }
// }




//////// 5️⃣ Getter and Setter ////////

// Setter
// Used to set value.

// void setMarks(int m)
// {
//     marks = m;
// }


// Getter
// Used to get value.

// int getMarks()
// {
//     return marks;
// }




/////// 6️⃣ Proper Encapsulation with Validation ////////////
// Real advantage of encapsulation → validation.

// class Student{
//     private int marks;

//     public void setMarks(int m){
//         if(m >= 0 && m <= 100){
//             marks = m;
//         }
//         else{
//             System.out.println("Invalid marks");
//         }
//     }

//     public int getMarks(){
//         return marks;
//     }
// }

// public class Encapsulation {
//     public static void main(String[] args){
//         Student s = new Student();

//         s.setMarks(95);
//         System.out.println(s.getMarks());

//         s.setMarks(150);
//     }
// } // This protects data.



///////////// 🔟 Perfect Encapsulation Example (Interview Level) //////////////
// class Employee{
//     private int id;
//     private String name;

//     public void setId(int i){
//         id = i;
//     }
//     public int getId(){
//         return id;
//     }
//     public void setName(String n){
//         name = n;
//     }
//     public String getName(){
//         return name;
//     }
// }
// public class Encapsulation {
//     public static void main(String[] args){
//         Employee e = new Employee();
//         e.setId(101);
//         e.setName("Atharav");

//         System.out.println(e.getId());
//         System.out.println(e.getName());
//     }
// }