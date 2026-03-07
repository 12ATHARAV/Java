public class Operators {
    public static void main(Strings[] args){
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

        // int a = 5;
        // int b = a++ + ++a;        // 5(a becomes 6) + 7 = 12
        // System.out.println(b);


        // 3. Relational Operators
        // int a = 10;
        // int b = 20;

        // System.out.println(a > b);   // false
        // System.out.println(a == b);  // false



        // 4. Logical Operators
        // System.out.println(true && false);   // false
        // System.out.println(true || false);   // true
        // System.out.println(!true);           // false

        //short circuit  --> If first condition is false, second condition will NOT execute.
        // int a = 10;
        // if (a > 5 && a++ < 20){
        //     System.out.println("Hello");
        // }
        // System.out.println(a);



        // 5. Assignment Operators
        // int a = 10;
        // a += 5;
        // System.out.println(a);



        // 6. Bitwise Operators
        // int a = 5;   // 0101
        // int b = 3;   // 0011

        // System.out.println(a & b);  // 1
        // System.out.println(a | b);  // 7
        // System.out.println(a ^ b);  // 6



        // 7. Shift Operators
        // int a = 5;  // 000101
        // System.out.println(a << 1);  //10

        // int b = 5;  // 000101  // signed right shift
        // System.out.println(b >> 1);   // 2  

        // unsigned right shift (>>>)
        // For positive numbers, >> and >>> produce the same result
        // For negative numbers, the >>> operator replaces the sign bit (which is 1 in two's complement for negative numbers) with 0, thus converting the negative number into a large positive integer



        // 8. Ternary Operator
        // int a = 10;
        // String result = (a > 5) ? "Yes" : "No";
        // System.out.println(result);  // Yes



        // 9. instanceof Operator
        String name = "Atharav";
        System.out.println(name instanceof String);  //true

    }
}
