public class Operators {
    public static void main(String[] args){
        // 1. Arithmetic Operators
        // int a = 10;
        // int b = 3;

        // System.out.println(a + b);  // 13
        // System.out.println(a - b);  // 7
        // System.out.println(a * b);  // 30
        // System.out.println(a / b);  // 3
        // System.out.println((double)a / b); // 3.3333
        // System.out.println(a % b);  // 1


        // 2. Unary Operators
        // int a = 5;
        // System.out.println(++a);  // 6  (pre increment)

        // int a = 5;
        // System.out.println(a++);   // 5   (post increment)
        // System.out.println(a);     // 6

        int a = 5;
        int b = a++ + ++a;        // 5(a becomes 6) + 7 = 12
        System.out.println(b);
    }
}
