package Collectionss;

// A lambda expression is a short way to write functions.

// Used mainly with functional interfaces.

// Syntax:
// (parameters) -> expression


//////// Example without Lambda ////////

// interface MyInterface{
//     void show();
// }
// class Test implements MyInterface{
//     public void show(){
//         System.out.println("PTC drive over, not shortlisted, haa haa haa");
//     }
// }
// public class Lambda_Expressions {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();
//     }
// }




//////// Same example using Lambda /////////

interface MyInterface{
    void show();
}
public class Lambda_Expressions {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Lets comeback.");
        obj.show();
    }
}